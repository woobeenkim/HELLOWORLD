package com.javaex.ex04;


public class Ex03 {
	public static void main(String[] args)
	{
		/*
		while(b<10)
		{
			System.out.println("8 x " + b + " = " + a*b);
			b++;
		}*/
		for(int a=2; a<10; a++)
		{
			for(int b=1; b<10; b++)
			{
			System.out.println(a + " * " + b +" = "+ a*b);
			}
			System.out.println(" ");
		}
	}
}
