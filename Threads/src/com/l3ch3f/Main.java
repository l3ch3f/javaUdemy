package com.l3ch3f;

public class Main {

	public static void main(String[] args) {
		System.out.println("Helloooo");
		
		Thread anotherThread = new AnotherThread();
		anotherThread.start();
		
		new Thread() {
			public void run() {
				System.out.println("Hello from anonymous class thread");
			}
		}.start();
		
		System.out.println("Hello from the main thread");
		
		
	}

}
