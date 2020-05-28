package com.javaex.ex03;

public class RectangleApp {
	public static void main(String[] args)
	{
		Rectangle a = new Rectangle(6,4);
		Rectangle b = new Rectangle(2,12);
		Rectangle c = new Rectangle(3,8);

		System.out.println("==equals()값 비교");
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
	}
}
