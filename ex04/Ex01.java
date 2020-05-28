package com.javaex.ex04;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해주세요 : ");
		a = sc.nextInt();
		/*
		while(b<10)
		{
			System.out.println("8 x " + b + " = " + a*b);
			b++;
		}*/
		for(int b=1; b<10; b++)
		{
			System.out.println(a + " * " + b +" = "+ a*b);
		}
	}
}
