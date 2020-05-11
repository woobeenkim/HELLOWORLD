package com.javaex.practice03;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args)
	{
		int i,a,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		a = sc.nextInt();
		
	
		for(i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				System.out.println(i);
			}
			else
			{
				
			}
		}	
	}
}
