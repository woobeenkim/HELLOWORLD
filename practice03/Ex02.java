package com.javaex.practice03;

public class Ex02 {
	public static void main(String[] args)
	{
		
		int x,y;
		for(x=0; x<4; x++)
		{
			for(y=0; y<2; y++)
			{
				System.out.println("*");
			}
			System.out.println("");
		}
	}
}
/*
  x가 줄의 갯수이며 4가 될떄까지 늘어나기 때문에 총 4번의 별이 찍힘
  y가 별의 갯수는 4번동안 별의 갯수이고 println으로 찍히기 때문에
  *
  *
  과 같이 줄을 바꾸면서 4번
  *
  *
  
  *
  *
  
  *
  *
  
  *
  *
  
  
 
 */