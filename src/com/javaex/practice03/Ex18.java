package com.javaex.practice03;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		c = sc.nextInt();
		

		for(a=0; a<(2*c)-1; a++)
		{
			if(a<c)
			{
				for(b=c; b>a; b--)
				{
					
				System.out.print("*");
				}
				System.out.println("");
			}
			else
			{
				for(b=0; b<a-(c-2); b++)
				{
					
				System.out.print("*");
				}
				System.out.println("");
				}
		}
		
	}
}
