package com.javaex.ex04;

public class Ex09 {
	public static void main(String[] args)
	{
		int a=1,b;
		
		for( a=1; a<7; a++)
		{
			for(b=6; b>=a; b--)
			{
			System.out.print("*");
			}
			System.out.println("");
		}
		
		/*
		while(true)
		{
			if(a<7)
			{
				for(a=1; a<=6; a++)
				{
					for(b=1; b<=a; b++)
					{
					System.out.print("*");
					}
					System.out.println("");
				}
			}
			else
			{
				for( a=1; a<=6; a++)
				{
					for(b=5; b>=a; b--)
					{
					System.out.print("*");
					}
					System.out.println("");
				}
				break;
			
			}
		}*/
		
	
		
		
	}
}
