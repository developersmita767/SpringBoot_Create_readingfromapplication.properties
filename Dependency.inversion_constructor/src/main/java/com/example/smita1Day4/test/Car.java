package com.example.smita1Day4.test;

import org.springframework.stereotype.Component;

@Component
public class Car {
    Engine engine;

	
    public void setEngine(Engine engine) {
		this.engine = engine;
	}


	public void show() {
    	engine.start();
    }
    
}
