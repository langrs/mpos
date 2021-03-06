
package com.site.webService.call;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.2
 * 2017-04-19T10:15:57.041+08:00
 * Generated source version: 3.1.2
 * 
 */
public final class IntegrationEntry_IntegrationEntry_Client {

    private static final QName SERVICE_NAME = new QName("http://entry.serviceengine.cross.digiwin.com", "IntegrationEntry");

    private IntegrationEntry_IntegrationEntry_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = IntegrationEntry_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        IntegrationEntry_Service ss = new IntegrationEntry_Service(wsdlURL, SERVICE_NAME);
        IntegrationEntry port = ss.getIntegrationEntry();  
        
        {
        System.out.println("Invoking invokeEtl...");
        String _invokeEtl_in0 = "";
        String _invokeEtl__return = port.invokeEtl(_invokeEtl_in0);
        System.out.println("invokeEtl.result=" + _invokeEtl__return);


        }
        {
        System.out.println("Invoking regSrv...");
        String _regSrv_in0 = "";
        String _regSrv__return = port.regSrv(_regSrv_in0);
        System.out.println("regSrv.result=" + _regSrv__return);


        }
        {
        System.out.println("Invoking regEAI...");
        String _regEAI_in0 = "";
        String _regEAI__return = port.regEAI(_regEAI_in0);
        System.out.println("regEAI.result=" + _regEAI__return);


        }
        {
        System.out.println("Invoking getSrv...");
        String _getSrv_in0 = "";
        String _getSrv__return = port.getSrv(_getSrv_in0);
        System.out.println("getSrv.result=" + _getSrv__return);


        }
        {
        System.out.println("Invoking getEtlJobList...");
        String _getEtlJobList_in0 = "";
        String _getEtlJobList__return = port.getEtlJobList(_getEtlJobList_in0);
        System.out.println("getEtlJobList.result=" + _getEtlJobList__return);


        }
        {
        System.out.println("Invoking getProdList...");
        String _getProdList__return = port.getProdList();
        System.out.println("getProdList.result=" + _getProdList__return);


        }
        {
        System.out.println("Invoking invokeMdm...");
        String _invokeMdm_in0 = "";
        String _invokeMdm__return = port.invokeMdm(_invokeMdm_in0);
        System.out.println("invokeMdm.result=" + _invokeMdm__return);


        }
        {
        System.out.println("Invoking regProdAP...");
        String _regProdAP_in0 = "";
        String _regProdAP__return = port.regProdAP(_regProdAP_in0);
        System.out.println("regProdAP.result=" + _regProdAP__return);


        }
        {
        System.out.println("Invoking invokeSrv...");
        String _invokeSrv_in0 = "";
        String _invokeSrv__return = port.invokeSrv(_invokeSrv_in0);
        System.out.println("invokeSrv.result=" + _invokeSrv__return);


        }
        {
        System.out.println("Invoking getParamList...");
        String _getParamList__return = port.getParamList();
        System.out.println("getParamList.result=" + _getParamList__return);


        }
        {
        System.out.println("Invoking getProd...");
        String _getProd_in0 = "";
        String _getProd__return = port.getProd(_getProd_in0);
        System.out.println("getProd.result=" + _getProd__return);


        }

        System.exit(0);
    }

}
