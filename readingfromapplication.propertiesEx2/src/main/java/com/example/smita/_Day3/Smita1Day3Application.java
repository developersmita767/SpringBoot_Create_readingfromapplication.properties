package com.example.smita._Day3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.smita._Day3.test.Employee;
import com.example.smita.demo.Student;

@SpringBootApplication
public class Smita1Day3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Smita1Day3Application.class, args);
		
		Employee employee = context.getBean("employee",Employee.class);
		employee.display();
	}

}
