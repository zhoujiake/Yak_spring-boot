package com.example.yak.domain.model;

import java.io.Serializable;

public class Datebase implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}










