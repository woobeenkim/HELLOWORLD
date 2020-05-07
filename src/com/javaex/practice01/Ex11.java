package com.javaex.practice01;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("월급을 입력하세요 : ");
		a = sc.nextInt();
		b = a * 12 * 10;
		System.out.print("10년동안 최대 저축액은 " + b +"원 입니다.");
	}
}
