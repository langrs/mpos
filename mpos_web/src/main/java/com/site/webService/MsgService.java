package com.site.webService;

import javax.jws.WebParam;
import javax.jws.WebService;
@WebService(targetNamespace = "self.webservice.msgService")
public interface MsgService {
	public int send(@WebParam(name = "phoneNumber") String phoneNumber, @WebParam(name = "smsContent") String smsContent);
}
