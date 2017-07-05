package com.atguigu.atcrowdfunding.common.bean;

public class Param {

	private Integer id;
	private String name;
	private String code;
	private String val;

	public Param() {
		super();
	}

	public Param(Integer id, String name, String code, String val) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.val = val;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

}
