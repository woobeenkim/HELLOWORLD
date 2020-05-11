package com.javaex.practice03;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args)
	{
		int i,a,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		a = sc.nextInt();
		
	if(a%2==0)
	{
		for(i=0;i<=a;i++)
		{
			if(i%2==0)
			{
				sum+=i;
			}
		}
	}	
	else
	{
		for(i=0;i<=a;i++)
		{
			if(i%2!=0)
			{
				sum+=i;
			}
		}
	}
		System.out.println("결과값 : "+sum);
		
		
		
	}
}

