package com.javaex.practice03;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args)
	{
		int a=0, b=0, ac=0;
		Scanner sc = new Scanner(System.in);
		while(a!=4)
		{	
			System.out.println("----------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택>");
			a = sc.nextInt();
			switch(a)
			{
				case 1:
					System.out.println("예금액>");
					b = sc.nextInt();
					ac += b;
					break;
				
				case 2:
					System.out.println("출금액>");
					b = sc.nextInt();
					ac -= b;
					break;
				case 3:
					System.out.println("잔고액>"+ ac);
					break;
				case 4:
					System.out.println("프로그램 종료.");
					break;
					default:
					System.out.println("다시 입력해 주세요.");
					break;	
			}
		}
	}
}
