package com.site.webService.call;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.1.2
 * 2016-09-13T16:55:50.727+08:00
 * Generated source version: 3.1.2
 * 
 */
@WebServiceClient(name = "PosWebServiceImplService", 
                  wsdlLocation = "http://localhost:8388/mpos_hs_web/service/PosWebServiceImpl?wsdl",
                  targetNamespace = "http://impl.webService.site.com/") 
public class PosWebServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.webService.site.com/", "PosWebServiceImplService");
    public final static QName PosWebServiceImplPort = new QName("http://impl.webService.site.com/", "PosWebServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8388/mpos_hs_web/service/PosWebServiceImpl?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PosWebServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8388/mpos_hs_web/service/PosWebServiceImpl?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PosWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PosWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PosWebServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public PosWebServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PosWebServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PosWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns PosWebServiceImpl
     */
    @WebEndpoint(name = "PosWebServiceImplPort")
    public PosWebServiceImpl getPosWebServiceImplPort() {
        return super.getPort(PosWebServiceImplPort, PosWebServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PosWebServiceImpl
     */
    @WebEndpoint(name = "PosWebServiceImplPort")
    public PosWebServiceImpl getPosWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(PosWebServiceImplPort, PosWebServiceImpl.class, features);
    }

}
