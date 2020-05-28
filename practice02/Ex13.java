package com.javaex.practice02;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args)
	{
		float x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		System.out.print("숫자 : ");
		x = sc.nextFloat();
		if(x<=0)
		{
			y = (x*x*x)-(9*x)+2;
			System.out.print("계산결과는"+ y+ "입니다.");
		}
		else
		{
			y= 7*x +2;
			System.out.print("계산결과는"+ y + "입니다.");
		}
	}
	
}
