package com.hdg.vo;

public enum ResultEnum {
	SUCCESS(1,"服务器获取信息成功"),
	ERROR(-1,"服务器获取信息失败或没有此数据"),
	DEFAULT(0,"服务器无响应");
	private int status;
	private String msg;
	private ResultEnum(int status, String msg) {
		this.status = status;
		this.msg = msg;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
