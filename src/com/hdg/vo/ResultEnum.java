package com.hdg.vo;

public enum ResultEnum {
	SUCCESS(1,"��������ȡ��Ϣ�ɹ�"),
	ERROR(-1,"��������ȡ��Ϣʧ�ܻ�û�д�����"),
	DEFAULT(0,"����������Ӧ");
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
