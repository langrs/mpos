package com.site.entity;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel(value = "返回结果",description = "所有的返回结果")
public class ResultMap<T> {
	private String status;
	private String errorMsg;
	private T data;

	@ApiModelProperty(value = "返回结果对象")
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	@ApiModelProperty(value = "返回错误描述")
	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	@ApiModelProperty(value = "返回错误编码")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
