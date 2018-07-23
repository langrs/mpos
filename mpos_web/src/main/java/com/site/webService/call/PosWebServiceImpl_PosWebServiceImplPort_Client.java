
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
 * 2016-09-13T16:55:50.653+08:00
 * Generated source version: 3.1.2
 * 
 */
public final class PosWebServiceImpl_PosWebServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://impl.webService.site.com/", "PosWebServiceImplService");

    private PosWebServiceImpl_PosWebServiceImplPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = PosWebServiceImplService.WSDL_LOCATION;
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
      
        PosWebServiceImplService ss = new PosWebServiceImplService(wsdlURL, SERVICE_NAME);
        PosWebServiceImpl port = ss.getPosWebServiceImplPort();  
        
        {
        System.out.println("Invoking queryPromName...");
        String _queryPromName_itemNo = "";
        String _queryPromName__return = port.queryPromName(_queryPromName_itemNo);
        System.out.println("queryPromName.result=" + _queryPromName__return);


        }
        {
        System.out.println("Invoking getRtnRight...");
        String _getRtnRight_arg0 = "";
        String _getRtnRight_arg1 = "";
        String _getRtnRight__return = port.getRtnRight(_getRtnRight_arg0, _getRtnRight_arg1);
        System.out.println("getRtnRight.result=" + _getRtnRight__return);


        }
        {
        System.out.println("Invoking preSale...");
        String _preSale_saleInfo = "";
        String _preSale__return = port.preSale(_preSale_saleInfo);
        System.out.println("preSale.result=" + _preSale__return);


        }
        {
        System.out.println("Invoking makeJffl...");
        String _makeJffl_arg0 = "";
        String _makeJffl_arg1 = "";
        String _makeJffl_arg2 = "";
        double _makeJffl_arg3 = 0.0;
        double _makeJffl_arg4 = 0.0;
        double _makeJffl_arg5 = 0.0;
        String _makeJffl__return = port.makeJffl(_makeJffl_arg0, _makeJffl_arg1, _makeJffl_arg2, _makeJffl_arg3, _makeJffl_arg4, _makeJffl_arg5);
        System.out.println("makeJffl.result=" + _makeJffl__return);


        }
        {
        System.out.println("Invoking sale...");
        String _sale_arg0 = "";
        String _sale__return = port.sale(_sale_arg0);
        System.out.println("sale.result=" + _sale__return);


        }
        {
        System.out.println("Invoking couponQuery...");
        String _couponQuery_couponNo = "";
        String _couponQuery__return = port.couponQuery(_couponQuery_couponNo);
        System.out.println("couponQuery.result=" + _couponQuery__return);


        }
        {
        System.out.println("Invoking czkQuery...");
        String _czkQuery_cdinfo = "";
        String _czkQuery_shopId = "";
        String _czkQuery__return = port.czkQuery(_czkQuery_cdinfo, _czkQuery_shopId);
        System.out.println("czkQuery.result=" + _czkQuery__return);


        }
        {
        System.out.println("Invoking makeCoupon...");
        String _makeCoupon_arg0 = "";
        String _makeCoupon_arg1 = "";
        String _makeCoupon__return = port.makeCoupon(_makeCoupon_arg0, _makeCoupon_arg1);
        System.out.println("makeCoupon.result=" + _makeCoupon__return);


        }
        {
        System.out.println("Invoking queryJffl...");
        String _queryJffl_arg0 = "";
        String _queryJffl_arg1 = "";
        String _queryJffl_arg2 = "";
        String _queryJffl__return = port.queryJffl(_queryJffl_arg0, _queryJffl_arg1, _queryJffl_arg2);
        System.out.println("queryJffl.result=" + _queryJffl__return);


        }
        {
        System.out.println("Invoking vipQuery...");
        String _vipQuery_cdinfo = "";
        String _vipQuery_billno = "";
        String _vipQuery_shopId = "";
        String _vipQuery__return = port.vipQuery(_vipQuery_cdinfo, _vipQuery_billno, _vipQuery_shopId);
        System.out.println("vipQuery.result=" + _vipQuery__return);


        }

        System.exit(0);
    }

}
