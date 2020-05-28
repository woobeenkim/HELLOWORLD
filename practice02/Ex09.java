package com.javaex.practice02;

import java.util.Scanner;

public class Ex09 {
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
			if(a%b == 0)
			{
				System.out.print(a+"는(은)"+b+"의 약수입니다.");	
			}
			else
			{
				System.out.print(a+"는(은)"+b+"의 약수가 아닙니다.");	
			}
		}
		else
		{
			if(b%a == 0)
			{
				System.out.print(b+"는(은)"+a+"의 약수입니다.");	
			}
			else
			{
				System.out.print(b+"는(은)"+a+"의 약수가 아닙니다.");	
			}
		}
	}
}
