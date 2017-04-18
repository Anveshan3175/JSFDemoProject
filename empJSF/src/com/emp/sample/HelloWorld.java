package com.emp.sample;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloWorld {

	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private String message = "Hellow World";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public String hello(){
		message = message.toUpperCase();
		
		return "Welcome";
	}

}
