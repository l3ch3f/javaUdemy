package com.l3ch3f.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.l3ch3f.demo.cars.Corola;
import com.l3ch3f.demo.cars.EngineType;
import com.l3ch3f.demo.cars.Swift;


@Configuration
@ComponentScan("com.l3ch3f.demo")
public class AppConfig {

	@Bean("myCorola")
	public Corola corola() {
		return new Corola();
	}
	
	@Bean("swift")
	public Swift swift() {
		return new Swift();
	}
	
	@Bean("EngineType")
	public EngineType engineType() {
		return new EngineType("V8");
	}
}
