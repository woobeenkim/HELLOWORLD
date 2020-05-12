package com.javaex.practice04;

public class Ex01 {
	public static void main(String[] args)
	{
		int[] a = new int[5];
		int result = 0;
		a[0] = 3;
		a[1] = 6;
		a[2] = 9;
		for(int i=0; i<=a.length;i++)
		{
			result += a[i];

		}

		System.out.println(result);
	}
}
//방은 0부터4까지 총 5개의 방이있는데 방의 길이인 5를 주소에 대입하여
//오류가 남.