package com.brt.entity;

public class Area {
	private Integer code;
	private String name;
	private Integer parentcode;	
	private String enname;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getParentcode() {
		return parentcode;
	}
	public void setParentcode(Integer parentcode) {
		this.parentcode = parentcode;
	}
	public String getEnname() {
		return enname;
	}
	public void setEnname(String enname) {
		this.enname = enname;
	}
}
