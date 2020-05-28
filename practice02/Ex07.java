package com.javaex.practice02;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("숫자 2개를 입력해주세요.");
		System.out.print("첫번재 숫자 : ");	
		a = sc.nextInt();
		System.out.print("두번재 숫자 : ");	
		b = sc.nextInt();
		if(a>b)
		{
			System.out.println(" 몫 : "+ a/b);
			System.out.println(" 나머지 : " + a%b);
		}
		else
		{
			System.out.println(" 몫 : "+ b/a);
			System.out.println(" 나머지 : " + b%a);
		}
	}
}
