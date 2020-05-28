package com.javaex.ex05;

public class Ex03 {
	public static void main(String[] args)
	{
		int[] a = new int[6];
		int num;
		for(int i=0; i<a.length; i++)
		{
			a[i] = num = (int)(Math.random()*45)+1;
			System.out.print(a[i]+"  ");
		}
	}
}
