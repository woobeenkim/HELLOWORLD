package com.javaex.ex04;

public class Pointapp {
	public static void main(String[] args)
	{
		Point a = new Point();
		Point b = new Point();
		a.xSetter(5);
		a.ySetter(6);
		b.xSetter(10);
		b.ySetter(23);
		
		a.draw();
		b.draw();

	}

}
