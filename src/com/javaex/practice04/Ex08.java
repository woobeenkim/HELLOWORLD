package com.javaex.practice04;

public class Ex08 {
	public static void main(String[] args)
	{
		int[] a = new int[6];
		int num, i;
		for(i=0;i<a.length;i++)
		{
			a[i] = num = (int)(Math.random()*6)+1;
			for(int j=0; j<i;j++)
			{
				if(a[i]==a[j])
				{
					i--;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		/*
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
	

		*/
		
	}
}
