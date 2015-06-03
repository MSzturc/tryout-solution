//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.06.03 um 10:31:08 AM CEST 
//


package de.mszturc.tryout.solution.entity;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.mszturc.tryout.solution.entity package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.mszturc.tryout.solution.entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NumberListResponse }
     * 
     */
    public NumberListResponse createNumberListResponse() {
        return new NumberListResponse();
    }

    /**
     * Create an instance of {@link NumberListResponse.SerialNumberList }
     * 
     */
    public NumberListResponse.SerialNumberList createNumberListResponseSerialNumberList() {
        return new NumberListResponse.SerialNumberList();
    }

}
