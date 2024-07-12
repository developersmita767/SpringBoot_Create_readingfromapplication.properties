package com.example.smitaDay3.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("${user.username}")
	private String username;
	
	@Value("${user.age}")
	private Integer age;
	
	@Value("${user.address}")
	private String address;
	
	public void show() {
		System.out.println("Name="+username+"\nAge="+age+"\nAddress"+address);
	}

}
