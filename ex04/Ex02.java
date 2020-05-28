package com.javaex.ex04;


public class Ex02 {
	public static void main(String[] args)
	{
		int a=1,b=0;
		while(a<=10)
		{	
			b += a;
			System.out.println( a+" 까지의 합은 = " + b);
			a++;
		}
		System.out.println("1부터 10까지의 정수의 합은 " + b + " 입니다");
	}
}
