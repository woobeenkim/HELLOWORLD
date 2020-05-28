package com.javaex.practice01;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a, k , m = 1.609;
		System.out.print("마일을 입력하세요 : ");
		a = sc.nextInt();
		k = a * m;
		System.out.println(a + "마일은 "+ k +"킬로미터 입니다.");
	}
}
