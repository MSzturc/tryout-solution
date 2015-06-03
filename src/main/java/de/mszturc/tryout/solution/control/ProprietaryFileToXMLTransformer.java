package de.mszturc.tryout.solution.control;

import de.mszturc.tryout.solution.entity.NumberListResponse;
import de.mszturc.tryout.solution.entity.ObjectFactory;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import static java.util.stream.Collectors.toList;
import javax.xml.bind.JAXB;

/**
 * Author: MSzturc
 * Date:   03.06.2015 
 */
public class ProprietaryFileToXMLTransformer {

    private ObjectFactory factory;

    public ProprietaryFileToXMLTransformer() {
        factory = new ObjectFactory();
    }

    public void transform(Path input, Path output) {
        List<String> wholeFileAsString = read(input);
        NumberListResponse response = transform(wholeFileAsString);
        write(response, output);
    }

    private List<String> read(Path input) {
        try {
            return Files.readAllLines(input);
        } catch (IOException exception) {
            throw new IllegalArgumentException("Cannot read file", exception);
        }
    }

    private NumberListResponse transform(List<String> fromFile) {
        NumberListResponse result = readHeader(fromFile);
        result.getSerialNumberList().getSN().addAll(readSNList(fromFile));
        return result;
    }

    private void write(NumberListResponse response, Path output) {
        JAXB.marshal(response, output.toFile());
    }

    private String getHeader(List<String> fromFile) {
        return fromFile.get(0);
    }

    private NumberListResponse readHeader(List<String> fromFile) {
        NumberListResponse response = createEmptyResponse();

        StringTokenizer tokenizer = new StringTokenizer(getHeader(fromFile), "#");

        try {
            response.setEncodingType(tokenizer.nextToken());
            response.setIDType(tokenizer.nextToken());
            response.setGTIN(tokenizer.nextToken());
            response.setNumberFrom(tokenizer.nextToken());
            response.setNumberTo(tokenizer.nextToken());
        } catch (NoSuchElementException ex) {
            throw new IllegalArgumentException("File header not parseable");
        }

        return response;
    }

    private List<Long> readSNList(List<String> snList) {
        return snList.stream()
                .skip(1)
                .map(item -> Long.valueOf(item))
                .collect(toList());
    }

    private NumberListResponse createEmptyResponse() {
        NumberListResponse result = factory.createNumberListResponse();
        result.setSerialNumberList(factory.createNumberListResponseSerialNumberList());
        return result;
    }
}
