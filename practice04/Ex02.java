package com.javaex.practice04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double[] a = new double[3];

		for(int i=0; i<a.length; i++)
		{
			System.out.println("숫자를 입력해주세요 : ");
			a[i] = sc.nextDouble();

		}
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("");
		System.out.println("====================================");

	}
}
