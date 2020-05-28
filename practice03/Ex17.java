package com.javaex.practice03;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args)
	{
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		c = sc.nextInt();
		
		for(int a=0; a<c; a++)
		{
			for(int b=c; b>a; b--)
			{
			System.out.print("*");
			}
			System.out.println("");
		}
	}
}
 