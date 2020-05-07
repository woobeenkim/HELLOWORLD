package com.javaex.practice02;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args)
	{
		double x, tax;
		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해 주세요.");
		System.out.print("금익 : ");
		x = sc.nextDouble();
		if(x>=8000)
		{
			tax= (1000*0.09) + (3000*0.18) + (4000*0.27) + (0.36*(x-8000));
			System.out.println("소득세는"+ tax + "입니다");
		}
		else if(x>4000)
		{
			tax=(1000*0.09) + (3000*0.18) + (0.27*(x-4000));
			System.out.println("소득세는"+ tax + "입니다");
		}
		else if(x>1000)
		{
			tax = (1000*0.09) + (0.18*(x-1000));
			System.out.println("소득세는"+ tax + "입니다");
		}
	
		else if(x>0)
		{
			tax= 0.09*x;
			System.out.println("소득세는"+ tax + "입니다");
		}
		else
		{
			System.out.println("잘못 입력했습니다.");
		}
	}
}
