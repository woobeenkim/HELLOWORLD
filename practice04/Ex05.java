package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args)
	{
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		int ave=0;
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
			ave += a[i];
		}
		ave = ave/(a.length);
		System.out.println("평균은 " +(double)ave+" 입니다.");
	}
}
