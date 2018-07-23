package com.site.webService.impl;

import javax.jws.WebService;

import com.site.webService.MsgService;
@WebService(endpointInterface = "com.site.webService.MsgService", targetNamespace = "self.webservice.msgService")
public class MsgServiceImpl implements MsgService {
	public int send(String phoneNumber, String smsContent) {
		System.out.println("请求短信接口成功" + phoneNumber + smsContent);
		return 0;
	}
}
