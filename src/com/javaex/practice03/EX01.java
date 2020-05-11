package com.javaex.practice03;

public class EX01 {
	public static void main(String[] args)
	{
		System.out.println("while문");
		int index =0;
		while(index < 3)
		{
			System.out.println("index = "+ index);
			index++;
		}
		System.out.println("for문");
	
		for(int order=0; order<3; order++)
		{
			System.out.println("order = "+ order);
		}
	}
}
/*
inder = 0
inder = 1
inder = 2
order = 0
order = 1
order = 2
  
 
 */
