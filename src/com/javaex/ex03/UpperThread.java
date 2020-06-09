package com.javaex.ex03;

public class UpperThread extends Thread{
	public void run()
	{
		for(char i='a'; i<='z'; i++)
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
