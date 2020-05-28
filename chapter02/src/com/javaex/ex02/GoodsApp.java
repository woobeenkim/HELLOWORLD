package com.javaex.ex02;

import java.util.Scanner;

public class GoodsApp {
	public static void main(String[] args)
	{
		GoodsA Fur = new GoodsA();
		Scanner sc = new Scanner(System.in);
		char an=' ';
		System.out.println("가전제품을 입력하시겠습니까?(y/n)");
		an = sc.next().charAt(0);
		while(an=='n')
		{
			for(int i=0; i<Fur.S[i].length(); i++)
			{
				if(an == 'y')
				{
					System.out.println("입력 할 가전제품 : ");
					Fur.S[i] = sc.next();
					System.out.println("가격 : ");
					Fur.P[i] = sc.nextInt();
				}
				else if(an =='n')
				{
					break;
				}
				else
				{
					System.out.println("잘못 입력하셨습니다.");
				}
				System.out.println("가전제품을 입력하시겠습니까?(y/n)");
				an = sc.next().charAt(0);
			}
		}
		
		System.out.println("가전제품 입력을 종료합니다.");
		System.out.println("등록 되어있는 가전제품목록 및 가격");
		for(int i=0; i<Fur.S[i].length();i++)
		{
		System.out.println(Fur.S[i]);
		System.out.println(Fur.P[i]);
		}
		
		
		
/*
		com.name = "LG그램";
		com.price = 900000;
		Furni.name = "머그컵";
		Furni.price = 2000;
		System.out.println("상품이름 : " +Furni.name);
		System.out.println("가격 : " +Furni.price);

		System.out.println("상품이름 : " +com.name);
		System.out.println("가격 : " +com.price);
		*/
	}
}
