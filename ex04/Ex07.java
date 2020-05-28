package com.javaex.ex04;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		a = sc.nextInt();
		System.out.println(a);
		while(!(a==0))
		{
			if(a%3==0)
			{
				System.out.println("3의 배수입니다.");
			}
			else
			{
				System.out.println("3의 배수가 아닙니다.");
			}
			System.out.println("숫자를 입력하세요.");
			a = sc.nextInt();
		}
		System.out.println("종료");
		sc.close();
	}
}
