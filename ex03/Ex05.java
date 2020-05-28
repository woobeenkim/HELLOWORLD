package com.javaex.ex03;
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args)
	{
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		if(score%3==0)
		{
			System.out.print("3의 배수입니다.");
		}
		else
		{
			System.out.print("3의 배수가 아닙니다.");
		}
	}

}
