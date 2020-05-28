package com.javaex.practice03;

public class Ex06 {
	public static void main(String[] args)
	{
		
		int x=5,y=7,j=0;
				for(j=1; !(j%5==0&&j%7==0);j++)
				{	
					
				}
				while(j<=100)
				{
					System.out.println(j);
					j+=j;
				}			
	}
}
/*
먼저 3과 5의 최소공배수를 구한후 그값의 배수를 100이하로 출력하는 반복문을 만듬.


*/