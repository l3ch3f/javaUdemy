package com.l3ch3f;

class MyCounter {
	private int threadNo;

	public MyCounter(int threadNo) {
		super();
		this.threadNo = threadNo;
	}

	public void countMe() {
		for (int i = 1; i <= 9; i++) {
			System.out.println("The value if i is: " + i + "and the thread number is: " + threadNo);
		}
	}
}

public class App {

	public static void main(String[] args) {

		MyCounter counter1 = new MyCounter(1);
		MyCounter counter2 = new MyCounter(2);
//		testing
		counter1.countMe();
		System.out.println("**********************");
		counter2.countMe();

	}

}
