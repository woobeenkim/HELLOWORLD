package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = sc.nextInt();
		if(score>=60)
		{
			System.out.print("합격입니다.");
		}
		else
		{
			System.out.print("불합격입니다.");
		}
		sc.close();
	}

}
