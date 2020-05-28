package com.javaex.ex05;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		char[] c = new char[5];

		for(int i=0; i<a.length; i++)
		{
			System.out.println("숫자를 입력해주세요 : ");
			a[i] = sc.nextInt();

			System.out.println("문자를 입력해주세요 : ");
			c[i] = sc.next().charAt(0);
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]);
		}
		System.out.println("");
		System.out.println("====================================");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(c[i]);
		}
		
	}
}
