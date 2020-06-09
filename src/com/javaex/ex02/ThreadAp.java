package com.javaex.ex02;

public class ThreadAp {
	public static void main(String[] args)
	{
		Runnable di = new DigitThreadimp();
		Thread thread1 = new Thread(di);

		Runnable li = new LowerThreadimp();
		Thread thread2 = new Thread(li);

		Runnable ui = new UpperThreadimp();
		Thread thread3 = new Thread(ui);
		/*
		 or
		 Thread thread1 = new Thread(new DigitThreadimp()); 
		*/
	
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
