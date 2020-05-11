package com.javaex.practice03;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args)
	{
		int a,b=0;
		Scanner sc = new Scanner(System.in);
	
		for(int i=0; i<5; i++)
		{
			System.out.println("숫자를 입력하세요.");
			a = sc.nextInt();
				if(a>b)
				{
					b=a;
				}
				else
				{
					b=b;
				}
		}
		System.out.println("가장 큰 수는"+ b + "입니다.");
	}
}
