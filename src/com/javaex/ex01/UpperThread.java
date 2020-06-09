package com.javaex.ex01;

public class UpperThread extends Thread{
	public void run()
	
	{
		Thread thread = new DigitThread();

		for(char ch='A'; ch<='Z';ch++)
		{
			System.out.println(ch);	
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
