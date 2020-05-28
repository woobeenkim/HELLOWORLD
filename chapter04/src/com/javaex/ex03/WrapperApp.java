package com.javaex.ex03;

public class WrapperApp {
	public static void main(String[] args)
	{
		Integer i = new Integer(10);
		System.out.println(i);

		Integer i1 = new Integer(2);
		Integer i2 = new Integer(5);
		Integer result = i1 + i2;
		System.out.println(result);
		
		Integer result2 = new Integer(2)+ new Integer(5);
		System.out.println(result2);
		
		Integer i3 = 4;
		System.out.println("=======================");

		Integer i4 = 10; //박싱
		Integer i5 = new Integer(100);
		int i6 = i5; //언박싱
		
		Integer i10 = new Integer(100);
		
		int i11 = i10.parseInt("1234"); // --> 문자를 숫자로 변환
		System.out.println(i11+1);
		
		int i12 = Integer.parseInt("1234");
		System.out.println(i12+1);
		
		String s100 = new String("100");
		String s101 = s100.valueOf(100); //숫자(정수)를 문자로 변환
		System.out.println(s101+1);
		
		
		
	}
}
