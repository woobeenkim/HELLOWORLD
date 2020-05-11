package com.javaex.practice03;

public class Ex03 {
	public static void main(String[] args)
	{
		
		int x,y;
		for(x=0; x<4; x++)
		{
			for(y=2; y>=0; y--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
/*
x는 0~3 총 4줄을 출력
y는 한 줄마다 y의 시작값인 2를 통해 3개의 별을 각 줄에출력
y값이 0이되는 순간까지



*/