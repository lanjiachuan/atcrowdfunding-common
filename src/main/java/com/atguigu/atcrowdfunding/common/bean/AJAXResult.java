package com.atguigu.atcrowdfunding.common.bean;

import java.util.List;

public class AJAXResult{

	private List datas;
	private String message;
	private boolean success;
	private String errorMsg;
	@SuppressWarnings("rawtypes")
	private Page pageObj;

	
	public List getDatas() {
		return datas;
	}

	public void setDatas(List datas) {
		this.datas = datas;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@SuppressWarnings("rawtypes")
	public Page getPageObj() {
		return pageObj;
	}

	public void setPageObj(@SuppressWarnings("rawtypes") Page pageObj) {
		this.pageObj = pageObj;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
