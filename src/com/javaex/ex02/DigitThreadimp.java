package com.javaex.ex02;

public class DigitThreadimp implements Runnable{

	public void run()
	{
		for(int i=0; i<=26; i++)
		{
			System.out.println(i);
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
