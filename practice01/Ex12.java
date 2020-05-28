package com.javaex.practice01;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a, b, pi;
		pi = 3.14;
		System.out.print("반지름을 입력하세요 : ");
		a = sc.nextInt();
		b = a * a * pi;
		System.out.println("원의 넓이는 "+ b +"입니다.");
	}
}
