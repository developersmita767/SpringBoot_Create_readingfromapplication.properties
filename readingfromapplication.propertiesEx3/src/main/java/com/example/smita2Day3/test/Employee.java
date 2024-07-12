package com.example.smita2Day3.test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
@ConfigurationProperties(prefix="user")
public class Employee {
	private String username;
	private Integer age;
	private String address;
	
	public void print() {
		System.out.println("Name="+username+"\nAge="+age+"\nAddress="+address);
	}

}
