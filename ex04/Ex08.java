package com.javaex.ex04;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args)
	{
		int a,b=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. [0이면 종료]");
		a = sc.nextInt();
		System.out.println(a);
		do
		{
			b +=a;
			System.out.println("합계 : " + b);
			a = sc.nextInt();
		}while(!(a==0));
		System.out.println("종료");
		sc.close();
	}
}
