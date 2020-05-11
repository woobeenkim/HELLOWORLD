package com.javaex.practice03;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args)
	{
		int i,a,sum=0,nc=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		a = sc.nextInt();
		
	
		for(i=1;i<=a;i++)
		{
			if(i%5==0)
			{
				sum += i;
				nc += 1;
			}
			else
			{
				
			}
		}	
		System.out.println("5의 배수의 개수 " + nc);
		System.out.println("5의 배수의 개수 " + sum);
	}
}
