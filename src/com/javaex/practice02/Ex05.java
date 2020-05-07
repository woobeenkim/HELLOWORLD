package com.javaex.practice02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.println("키 : ");
		a = sc.nextInt();
		System.out.println("몸무게 : ");
		b = sc.nextInt();
		c = (a-100)*0.9;
		if(b<c)
		{
			System.out.println("저체중 입니다.");	
		}
		else if(b==c)
		{
			System.out.println("표준 입니다.");	
		}
		else if(b>c)
		{
			System.out.println("과체중 입니다.");	
		}
	}
}
