package de.mszturc.tryout.solution.boundary;

import de.mszturc.tryout.solution.control.ProprietaryFileToXMLTransformer;
import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author MSzturc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws URISyntaxException {
        Path input = Paths.get(ClassLoader.getSystemResource("Input.txt").toURI());
        Path output = Paths.get(new File("C:/temp/output.xml").toURI());

        ProprietaryFileToXMLTransformer transformer = new ProprietaryFileToXMLTransformer();
        transformer.transform(input, output);
    }

}
