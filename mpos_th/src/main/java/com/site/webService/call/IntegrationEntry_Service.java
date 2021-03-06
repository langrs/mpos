package com.site.webService.call;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.2
 * 2017-04-19T10:15:57.117+08:00
 * Generated source version: 3.1.2
 * 
 */
@WebServiceClient(name = "IntegrationEntry", 
                  wsdlLocation = "http://172.169.10.86:9999/IntegrationEntry?WSDL",
                  targetNamespace = "http://entry.serviceengine.cross.digiwin.com") 
public class IntegrationEntry_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://entry.serviceengine.cross.digiwin.com", "IntegrationEntry");
    public final static QName IntegrationEntry = new QName("http://entry.serviceengine.cross.digiwin.com", "IntegrationEntry");
    static {
        URL url = null;
        try {
            url = new URL("http://172.169.10.86:9999/IntegrationEntry?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(IntegrationEntry_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://172.169.10.86:9999/IntegrationEntry?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public IntegrationEntry_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IntegrationEntry_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IntegrationEntry_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public IntegrationEntry_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public IntegrationEntry_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public IntegrationEntry_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns IntegrationEntry
     */
    @WebEndpoint(name = "IntegrationEntry")
    public IntegrationEntry getIntegrationEntry() {
        return super.getPort(IntegrationEntry, IntegrationEntry.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IntegrationEntry
     */
    @WebEndpoint(name = "IntegrationEntry")
    public IntegrationEntry getIntegrationEntry(WebServiceFeature... features) {
        return super.getPort(IntegrationEntry, IntegrationEntry.class, features);
    }

}
