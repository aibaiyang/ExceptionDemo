package com.example.demo.enums;

public enum ResultEnum {

	PRIMARY_SCHOOL(100,"你可能还在上小学"),
	MIDDLE_SCHOOL(101,"你可能在上初中"),
	;
	private Integer code;
	
	private String msg;

	ResultEnum(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
	
	
}
