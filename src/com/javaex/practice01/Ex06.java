package com.javaex.practice01;

public class Ex06 {
	public static void main(String[] args)
	{
		int i = 10;
		int n = i++ %2;
		
		System.out.println(i);
		System.out.println(n);
		
		/*i가 연산후에 1이 플러스 됨으로 
		 * 첫번째 i프린트는 11 2번째 n프린트에선 0이나옴
		*/
	}
}
