package com.javaex.ex04;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args)
	{
		int a,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		do
		{
			a = sc.nextInt();
			sum += a;
			System.out.println("합계 : " + sum);
		}while(a!=0);
		System.out.println("종료");
		sc.close();
	}
}
