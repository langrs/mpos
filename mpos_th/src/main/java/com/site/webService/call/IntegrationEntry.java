package com.site.webService.call;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.2
 * 2017-04-19T10:15:57.103+08:00
 * Generated source version: 3.1.2
 * 
 */
@WebService(targetNamespace = "http://entry.serviceengine.cross.digiwin.com", name = "IntegrationEntry")
@XmlSeeAlso({ObjectFactory.class})
public interface IntegrationEntry {

    @WebResult(name = "invokeEtlReturn", targetNamespace = "http://entry.serviceengine.cross.digiwin.com")
    @RequestWrapper(localName = "invokeEtl", targetNamespace = "http://entry.serviceengine.cross.digiwin.com", className = "com.site.webService.call.InvokeEtl")
    @WebMethod
    @ResponseWrapper(localName = "invokeEtlResponse", targetNamespace = "http://entry.serviceengine.cross.digiwin.com", className = "com.site.webService.call.InvokeEtlResponse")
    public String invokeEtl(
            @WebParam(name = "in0", targetNamespace = "http://entry.serviceengine.cross.digiwin.com")
                    String in0
    );

    @WebResult(name = "regSrvReturn", targetNamespace = "http://entry.serviceengine.cross.digiwin.com")
    @RequestWrapper(localName = "regSrv", targetNamespace = "http://entry.serviceengine.cross.digiwin.com", className = "com.site.webService.call.RegSrv")
    @WebMethod
    @ResponseWrapper(localName = "regSrvResponse", targetNamespace = "http://entry.serviceengine.cross.digiwin.com", className = "com.site.webService.call.RegSrvResponse")
    public String regSrv(
            @WebParam(name = "in0", targetNamespace = "http://entry.serviceengine.cross.digiwin.com")
                    String in0
    );

    @WebResult(name = "regEAIReturn", targetNamespace = "http://entry.serviceengine.cross.digiwin.com")
    @RequestWrapper(localName = "regEAI", targetNamespace = "http://entry.serviceengine.cross.digiwin.com", className = "com.site.webService.call.RegEAI")
    @WebMethod
    @ResponseWrapper(localName = "regEAIResponse", targetNamespace = "http://entry.serviceengine.cross.digiwin.com", className = "com.site.webService.call.RegEAIResponse")
    public String regEAI(
            @WebParam(name = "in0", targetNamespace = "http://entry.serviceengine.cross.digiwin.com")
                    String in0
    );

    @WebResult(name = "getSrvReturn", targetNamespace = "http://entry.serviceengine.cross.digiwin.com")
    @RequestWrapper(localName = "getSrv", targetNamespace = "http://entry.serviceengine.cross.digiwin.com", className = "com.site.webService.call.GetSrv")
    @WebMethod
    @ResponseWrapper(localName = "getSrvResponse", targetNamespace = "http://entry.serviceengine.cross.digiwin.com", className = "com.site.webService.call.GetSrvResponse")
    public String getSrv(
            @WebParam(name = "in0", targetNamespace = "http://entry.serviceengine.cross.digiwin.com")
                    String in0
    );

    @WebResult(name = "getEtlJobListReturn", targetNamespace = "http://entry.serviceengine.cross.digiwin.com")
    @RequestWrapper(localName = "getEtlJobList", targetNamespace = "http://entry.serviceengine.cross.digiwin.com", className = "com.site.webService.call.GetEtlJobList")
    @WebMethod
    @ResponseWrapper(localName = "getEtlJobListResponse", targetNamespace = "http://entry.serviceengine.cross.digiwin.com", className = "com.site.webService.call.GetEtlJobListResponse")
    public String getEtlJobList(
            @WebParam(name = "in0", targetNamespace = "http://entry.serviceengine.cross.digiwin.com")
                    String in0
    );

    @WebResult(name = "getProdListReturn", targetNamespace = "http://entry.serviceengine.cross.digiwin.com")
    @RequestWrapper(localName = "getProdList", targetNamespace = "http://entry.serviceengine.cross.digiwin.com", className = "com.site.webService.call.GetProdList")
    @WebMethod
    @ResponseWrapper(localName = "getProdListResponse", targetNamespace = "http://entry.serviceengine.cross.digiwin.com", className = "com.site.webService.call.GetProdListResponse")
    public String getProdList();

    @WebResult(name = "invokeMdmReturn", targetNamespace = "http://entry.serviceengine.cross.digiwin.com")
    @RequestWrapper(localName = "invokeMdm", targetNamespace = "http://entry.serviceengine.cross.digiwin.com", className = "com.site.webService.call.InvokeMdm")
    @WebMethod
    @ResponseWrapper(localName = "invokeMdmResponse", targetNamespace = "http://entry.serviceengine.cross.digiwin.com", className = "com.site.webService.call.InvokeMdmResponse")
    public String invokeMdm(
            @WebParam(name = "in0", targetNamespace = "http://entry.serviceengine.cross.digiwin.com")
                    String in0
    );

    @WebResult(name = "regProdAPReturn", targetNamespace = "http://entry.serviceengine.cross.digiwin.com")
    @RequestWrapper(localName = "regProdAP", targetNamespace = "http://entry.serviceengine.cross.digiwin.com", className = "com.site.webService.call.RegProdAP")
    @WebMethod
    @ResponseWrapper(localName = "regProdAPResponse", targetNamespace = "http://entry.serviceengine.cross.digiwin.com", className = "com.site.webService.call.RegProdAPResponse")
    public String regProdAP(
            @WebParam(name = "in0", targetNamespace = "http://entry.serviceengine.cross.digiwin.com")
                    String in0
    );

    @WebResult(name = "invokeSrvReturn", targetNamespace = "http://entry.serviceengine.cross.digiwin.com")
    @RequestWrapper(localName = "invokeSrv", targetNamespace = "http://entry.serviceengine.cross.digiwin.com", className = "com.site.webService.call.InvokeSrv")
    @WebMethod
    @ResponseWrapper(localName = "invokeSrvResponse", targetNamespace = "http://entry.serviceengine.cross.digiwin.com", className = "com.site.webService.call.InvokeSrvResponse")
    public String invokeSrv(
            @WebParam(name = "in0", targetNamespace = "http://entry.serviceengine.cross.digiwin.com")
                    String in0
    );

    @WebResult(name = "getParamListReturn", targetNamespace = "http://entry.serviceengine.cross.digiwin.com")
    @RequestWrapper(localName = "getParamList", targetNamespace = "http://entry.serviceengine.cross.digiwin.com", className = "com.site.webService.call.GetParamList")
    @WebMethod
    @ResponseWrapper(localName = "getParamListResponse", targetNamespace = "http://entry.serviceengine.cross.digiwin.com", className = "com.site.webService.call.GetParamListResponse")
    public String getParamList();

    @WebResult(name = "getProdReturn", targetNamespace = "http://entry.serviceengine.cross.digiwin.com")
    @RequestWrapper(localName = "getProd", targetNamespace = "http://entry.serviceengine.cross.digiwin.com", className = "com.site.webService.call.GetProd")
    @WebMethod
    @ResponseWrapper(localName = "getProdResponse", targetNamespace = "http://entry.serviceengine.cross.digiwin.com", className = "com.site.webService.call.GetProdResponse")
    public String getProd(
            @WebParam(name = "in0", targetNamespace = "http://entry.serviceengine.cross.digiwin.com")
                    String in0
    );
}
