package com.javaex.practice03;

import java.util.Random;
import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args)
	{
		int a,b;
		char c = 'n';
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		a = r.nextInt(100);
		if(a==0)
		{
			a +=1;
		}

		System.out.println(a);
		System.out.println("==========================================");
		System.out.println("[숫자 맞추기 게임 시작!]");
		System.out.println("==========================================");
		while(c!='y')
		{
			System.out.println(">>");
			b = sc.nextInt();
			if(b<a)
			{
				System.out.println("더 높게");
			}
			else if(b>a)
			{
				System.out.println("더 낮게");
			}
			else if(b==a)
			{
				System.out.println("정답입니다!");
				System.out.println("게임을 종료하시겠습니까?(y/n)");
				System.out.println(">>");
				c = sc.next().charAt(0);
				System.out.println(c);
				if(c=='n')	
				{
					a = r.nextInt(100);
					if(a==0)
					{
						a +=1;
					}
	
				}
				System.out.println(a);
			}
		}
		System.out.println("==========================================");
		System.out.println("[숫자 맞추기 게임 종료!]");
		System.out.println("==========================================");
	}

	
}
