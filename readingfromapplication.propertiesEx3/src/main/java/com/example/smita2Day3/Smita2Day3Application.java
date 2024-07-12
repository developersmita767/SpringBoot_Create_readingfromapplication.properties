package com.example.smita2Day3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.smita2Day3.test.Employee;

@SpringBootApplication
public class Smita2Day3Application {

	public static void main(String[] args) {
		ApplicationContext context    =SpringApplication.run(Smita2Day3Application.class, args);
		
		Employee employee=context.getBean("employee",Employee.class);
		employee.print();
		
		
	}

}
