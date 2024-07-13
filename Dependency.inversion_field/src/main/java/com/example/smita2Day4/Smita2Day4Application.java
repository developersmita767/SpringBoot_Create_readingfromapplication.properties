package com.example.smita2Day4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.smita2Day4.test.Car;

@SpringBootApplication
public class Smita2Day4Application {

	public static void main(String[] args) {
    ApplicationContext applicationContext=SpringApplication.run(Smita2Day4Application.class, args);
	
    Car car=applicationContext.getBean("car",Car.class);
    car.show();
	}

}
