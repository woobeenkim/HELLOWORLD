package com.javaex.practice04;

public class Ex03 {
	public static void main(String[] args)
	{
		int[] inta = {3, 6, 9};
		int[] intb;
		intb=inta;
		intb[0] =20;
		intb[2] = 10;
		
		for(int i=0; i<inta.length;i++)
		{
			System.out.println(inta[i]);
		}
	}
}
