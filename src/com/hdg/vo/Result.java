package com.hdg.vo;

public class Result {
	public static final String SUCCESS ="SUCCESS";
	public static final String ERROR ="ERROR";
	private Integer status;
	private Object data;
	private String msg;
	public Result() {
		super();
	}
	public Result(Integer status, Object data, String msg) {
		super();
		this.status = status;
		this.data = data;
		this.msg = msg;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Result [status=" + status + ", data=" + data + ", msg=" + msg + "]";
	}
}
