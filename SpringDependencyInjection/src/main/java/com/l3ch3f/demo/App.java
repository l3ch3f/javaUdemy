package com.l3ch3f.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.l3ch3f.demo.cars.Corola;
import com.l3ch3f.demo.cars.Swift;

import interfaces.Car;

public class App {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context =
		new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar = context.getBean("swift",Car.class);
		System.out.println(myCar.specs());
		context.close();
	}

}
