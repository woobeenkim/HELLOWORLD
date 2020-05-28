package com.javaex.practice01;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a, pi, v;
		System.out.print("반지름: ");
		a = sc.nextInt();
		pi = 3.14;
		v = 4.0/3.0*pi*(a*a*a);
		System.out.println("구의 부피는 :"+ v);
	}
}
