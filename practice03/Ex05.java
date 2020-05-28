package com.javaex.practice03;

public class Ex05 {
	public static void main(String[] args)
	{
		
		int i=1;
		boolean flag =true;
		while(flag)
		{
			if(i>=5)
			{
				flag =false;
			}
			System.out.println(i);
			i+=1;
		}
			
	}
}
/*
 i가 5가 될떄까지 i를 더해주는 반복문으로 i가 5가 넘어가면 false값을 줘 반복을 정지한다.
 매줄마다 숫자를 출력하고 자기자신을 더해준다. 
 1
 2
 3
 4
 5
 
 */