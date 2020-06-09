package com.javaex.ex01;

public class ThreadApp {
	public static void main(String[] args)
	{
		Thread dthread = new DigitThread();
		Thread uthread = new UpperThread();
		Thread lthread = new LowerThread();
		
		uthread.start();
		lthread.start();
		dthread.start();
		//thread.run();
	
	}
}
