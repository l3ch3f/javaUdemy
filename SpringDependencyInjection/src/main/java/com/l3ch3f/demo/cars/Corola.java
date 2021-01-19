package com.l3ch3f.demo.cars;

import org.springframework.beans.factory.annotation.Autowired;
import interfaces.Car;


public class Corola implements Car {
	@Autowired
	Engine engine;
	
	public String specs() {
		String specs = "Sedan from Toyota with engine type as " + engine.type;
		return specs;
	}

}
