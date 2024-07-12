package com.example.smitaDay3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.smitaDay3.test.Employee;

@SpringBootApplication
public class SmitaDay3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SmitaDay3Application.class, args);
		Employee employee=context.getBean("employee",Employee.class);
		employee.show();
	}

}
