package com.l3ch3f.demo.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import interfaces.Car;


public class Corola implements Car {
	@Autowired
	@Qualifier("V6 Engine")
	EngineType engine;
	
	public String specs() {
		String specs = "Sedan from Toyota with engine type as " + engine.type;
		return specs;
	}

}
