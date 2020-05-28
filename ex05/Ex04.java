package com.javaex.ex05;

public class Ex04 {
	public static void main(String[] args)
	{
		int[] arrA;
		arrA = new int[3];

		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		int[] arrB;
		arrB = new int[3];
		for(int i=0; i<arrA.length; i++)
		{
			arrB[i] = arrA[i];
		}
		for(int i=0; i<arrA.length; i++)
		{
			System.out.print(arrA[i]);
		}
		System.out.println("");
		for(int i=0; i<arrA.length; i++)
		{
			System.out.print(arrB[i]);
		}
	}
}
