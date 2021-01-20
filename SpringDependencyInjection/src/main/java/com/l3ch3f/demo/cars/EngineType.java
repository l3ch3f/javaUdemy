package com.l3ch3f.demo.cars;


public class EngineType {

	String type;
	
	
	public EngineType(String type) {
		this.type = type;
	}
	public EngineType() {
		type = "Unkown";
	}

	public String type() {
		return type;
	}
}
