
package com.site.webService.call;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.site.webService.call package. 
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

    private final static QName _ShowInfo_QNAME = new QName("http://impl.webService.site.com/", "showInfo");
    private final static QName _ShowInfoResponse_QNAME = new QName("http://impl.webService.site.com/", "showInfoResponse");
    private final static QName _ShowName_QNAME = new QName("http://impl.webService.site.com/", "showName");
    private final static QName _ShowNameResponse_QNAME = new QName("http://impl.webService.site.com/", "showNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.site.webService.call
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShowInfo }
     * 
     */
    public ShowInfo createShowInfo() {
        return new ShowInfo();
    }

    /**
     * Create an instance of {@link ShowInfoResponse }
     * 
     */
    public ShowInfoResponse createShowInfoResponse() {
        return new ShowInfoResponse();
    }

    /**
     * Create an instance of {@link ShowName }
     * 
     */
    public ShowName createShowName() {
        return new ShowName();
    }

    /**
     * Create an instance of {@link ShowNameResponse }
     * 
     */
    public ShowNameResponse createShowNameResponse() {
        return new ShowNameResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.webService.site.com/", name = "showInfo")
    public JAXBElement<ShowInfo> createShowInfo(ShowInfo value) {
        return new JAXBElement<ShowInfo>(_ShowInfo_QNAME, ShowInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.webService.site.com/", name = "showInfoResponse")
    public JAXBElement<ShowInfoResponse> createShowInfoResponse(ShowInfoResponse value) {
        return new JAXBElement<ShowInfoResponse>(_ShowInfoResponse_QNAME, ShowInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.webService.site.com/", name = "showName")
    public JAXBElement<ShowName> createShowName(ShowName value) {
        return new JAXBElement<ShowName>(_ShowName_QNAME, ShowName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.webService.site.com/", name = "showNameResponse")
    public JAXBElement<ShowNameResponse> createShowNameResponse(ShowNameResponse value) {
        return new JAXBElement<ShowNameResponse>(_ShowNameResponse_QNAME, ShowNameResponse.class, null, value);
    }

}
