package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		if(score>=90)
		{
			System.out.print("A등급");
		}
		else if(score>=80)
		{
			System.out.print("B등급");
		}
		else if(score>=70)
		{
			System.out.print("C등급");
		}
		else if(score>=60)
		{
			System.out.print("D등급");
		}else if(score>=0)
		{
			System.out.print("F등급");
		}
		else if(score<0)
		{
			System.out.print("음수입니다.");
		}
		sc.close();
	}

}
