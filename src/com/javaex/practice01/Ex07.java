package com.javaex.practice01;

public class Ex07 {
	public static void main(String[] args)
	{
		int i = 10;
		int n = ++i %2;
		
		System.out.println(i);
		System.out.println(n);
		
		/*i가 연산전에 1을 더해짐으로 첫번째 i프린트에선 11
		 두번째 n프린트에선 11을 2로 나눈 나머지가 나옴으로 1이 나온다.
		*/
	}
}
