package com.javaex.practice02;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("숫자 2개를 입력해주세요.");
		System.out.print("첫번재 숫자 : ");	
		a = sc.nextInt();
		System.out.print("두번재 숫자 : ");	
		b = sc.nextInt();
		System.out.print("세번재 숫자 : ");	
		c = sc.nextInt();
		if(a<b && a<c)
		{
			System.out.println("가장 작은 수는 "+ a +"입니다.");
		}
		else if(b<a && b<c)
		{
			System.out.println("가장 작은 수는 "+ b +"입니다.");
		}
		else if(c<a && c<b)
		{
			System.out.println("가장 작은 수는 "+ c +"입니다.");
		}
	}
}
