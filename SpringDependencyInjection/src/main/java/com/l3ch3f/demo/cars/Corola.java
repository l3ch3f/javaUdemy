package com.l3ch3f.demo.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import interfaces.Car;

@Component("myCorolla")
public class Corola implements Car {
	@Autowired
	Engine engine;
	
	public String specs() {
		String specs = "Sedan from Toyota with engine type as " + engine.type;
		return specs;
	}

}
