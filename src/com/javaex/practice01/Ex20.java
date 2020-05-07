package com.javaex.practice01;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("500원 개수 : ");
		a = sc.nextInt() * 500;
		System.out.println("100원 개수 : ");
		b = sc.nextInt() * 100;
		System.out.println("50원 개수 : ");
		c = sc.nextInt() * 50;
		System.out.println("10원 개수 : ");
		d = sc.nextInt() * 10;
		System.out.println("동전의 총합은  : "+ (a+b+c+d) +"입니다.");
		
		
	}
}
