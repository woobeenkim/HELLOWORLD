package com.javaex.practice02;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("숫자 2개를 입력해주세요.");
		System.out.print("숫자 1 : ");	
		a = sc.nextInt();
		System.out.print("숫자 2 : ");	
		b = sc.nextInt();
		if(a>b)
		{
			System.out.println("큰수 : "+ a +"      작은수 : "+ b);
		}
		else
		{
			System.out.println("큰수 : "+ b +"      작은수 : "+ a);
		}
	}
}
