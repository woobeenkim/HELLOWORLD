package com.javaex.ex04;

public class ThreaApp {
	public static void main(String[] args)
	{
		
	Thread t1 = new Thread(new UpperThread());
	Thread t2 = new Thread(new DigitThread());
	
	t1.start();
	t2.start();
	}
}
