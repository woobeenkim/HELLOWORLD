package com.javaex.practice01;

public class Ex03 {
	public static void main(String[] args)
	{
		int x = 1;
		int y = 1;
		
		int a = ++x *2;
		int b = y++ *2;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		/*++이 앞에있으면 그 변수에 1을 더한후 연산을 실행하고 
		 변수의 뒤에 ++이 붙으면 연산 후에 1을 더한다.
		 지금 변수 a는 x를 연산하기전에 1을 더하여 2가된후 2를 곱한것이고
		 
		 */
	}
}
