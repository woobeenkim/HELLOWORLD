package com.javaex.practice04;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args)
	{
		int[] a = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int[] c = new int[10];
		int b,d=50000,e=10000,i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("금액 : ");
		b = sc.nextInt();
		
		while(i<10)
		{
			if(b!=0)
			{
			c[i] = b/d;
			b -= (c[i]*a[i]);
			c[i+1] = b/e;
			b -= (c[i+1]*a[i+1]);
			}
			System.out.println( d+"원 : " + c[i] + "개");
			System.out.println( e+"원 : "+ c[i+1]+ "개");
			i+=2;
			d = d/10;
			e= e/10;
		}
		
		
	}
}
