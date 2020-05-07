package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int score = sc.nextInt();
		if(score>0)
		{
			System.out.print("양수입니다.");
		}
		else if(score<0)
		{
			System.out.print("음수입니다.");
		}
		else if(score==0)
		{
			System.out.print("0입니다.");
		}
		else
		{
			System.out.print("숫자가 아닙니다. 숫자를 입력해주세요 : ");
		}
		sc.close();
	}
}
