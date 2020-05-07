package com.javaex.practice01;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		System.out.print("가로를 입력하세요 : ");
		a = sc.nextInt();
		System.out.print("세로를 입력하세요 : ");
		b = sc.nextInt();
		c = 2.0*a + 2.0*b;
		System.out.println("사각형의 넓이는 "+ a*b +"입니다.");
		System.out.println("사각형의 둘레는 "+ c +"입니다.");
		
	}
}
