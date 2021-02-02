package com.l3ch3f;

public class Main {

	public static void main(String[] args) {
//		new Thread(new Runnable() {
//		@Override
//		public void run() {
//			System.out.println("Printing from the Runnable");
//		}
//	}).start();
		
		// Lambda
		new Thread(()-> System.out.println("Printing from the Runnable")).start();

}
}

class CodeToRun implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Printing from the Runnable");
	}
}