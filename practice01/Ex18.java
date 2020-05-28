package com.javaex.practice01;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a, b;
		System.out.print("화씨: ");
		a = sc.nextInt();
		b = 5.0/9.0*(a-32.0);
		System.out.println("화씨"+ a +"의 섭씨 온도는 "+ b +" 입니다.");
	}
}
