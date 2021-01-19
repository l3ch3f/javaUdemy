package com.l3ch3f.demo.cars;

import org.springframework.stereotype.Component;

import interfaces.Car;

@Component
public class Swift implements Car {

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "hatchBack from suzuki";
	}

}
