package com.javaex.practice02;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("사번(정수)를 입력해주세요.");
		System.out.print("사번 : ");
		a = sc.nextInt();
		b = a%3;
		if(b==0)
		{
			System.out.print("A팀입니다.");
		}
		else if(b==1)
		{
			System.out.print("B팀입니다.");	
		}
		else if(b==2)
		{
			System.out.print("C팀입니다.");	
		}
		else
		{
			System.out.print("잘못입력하셨습니다.");
		}
	}
}
