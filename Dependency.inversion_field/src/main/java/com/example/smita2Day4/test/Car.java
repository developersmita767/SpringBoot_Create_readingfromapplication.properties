package com.example.smita2Day4.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	Engine engine;
	public void show() {
		engine.start();
	}

}
