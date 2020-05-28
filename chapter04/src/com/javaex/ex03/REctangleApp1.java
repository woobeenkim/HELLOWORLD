package com.javaex.ex03;

public class REctangleApp1 {
	public static void main(String[] args)
	{
		REctangle1 a = new REctangle1(4,6);
		REctangle1 b = new REctangle1(2,12);
		REctangle1 c = new REctangle1(3,8);

		System.out.println("==equals()값 비교");
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
	}
}
