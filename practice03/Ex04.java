package com.javaex.practice03;

public class Ex04 {
	public static void main(String[] args)
	{
		
		for(int i=1; i<5; i++)
		{
			System.out.println(i);
		}
		System.out.println("======================");
		for(int i=10; i>0;i-=2)
		{
			System.out.println(i);
		}
			
	}
}
/*
위의 반복문에선 매줄마다 i의 값을 출력
1
2
3
4
가되고 중간에 줄바끔
========================
다음 포문에선 i를 10부터 2씩 줄여서 매줄에 출력
10
8
6
4
2



*/