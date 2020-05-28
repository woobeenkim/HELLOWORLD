package com.javaex.practice01;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a, b, c, d;
		System.out.print("상품가격 : ");
		a = sc.nextInt();
		System.out.print("받은돈 : ");
		b = sc.nextInt();
		c = a/10.0;
		d = b - a;
		System.out.println("받은돈 :"+ b);
		System.out.println("상품가격 :"+ a);
		System.out.println("부가세 :"+ c);
		System.out.println("잔액 :"+ d);
	}
}
