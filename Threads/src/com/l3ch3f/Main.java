package com.l3ch3f;

public class Main {

	public static void main(String[] args) {
		System.out.println("Helloooo");
		
		Thread anotherThread = new AnotherThread();
		anotherThread.start();
		
		System.out.println("Hello from the main thread");
	}

}
