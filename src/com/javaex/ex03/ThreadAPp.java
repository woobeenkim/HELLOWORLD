package com.javaex.ex03;

public class ThreadAPp {
	public static void main(String[] args)
	{

		Thread t1 = new UpperThread();
		Thread t2 = new DigitThread();
		
		t1.start();
		t2.start();
	}
}
