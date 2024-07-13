package com.example.smitaDay4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.smitaDay4.test.Car;

@SpringBootApplication
public class SmitaDay4Application {

	public static void main(String[] args) {
		   ApplicationContext applicationContext=SpringApplication.run(SmitaDay4Application.class, args);
		   
		   Car car=applicationContext.getBean("car",Car.class);
		   car.show();
	}

}

