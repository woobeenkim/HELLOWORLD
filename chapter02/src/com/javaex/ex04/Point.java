package com.javaex.ex04;

public class Point {
	private int x;
	private int y;
	
	
	public void xSetter(int xpoint)
	{
		x = xpoint;
	}
	public int xGetter(int x)
	{
		return x;
	}
	public void ySetter(int ypoint)
	{
		y = ypoint;
	}
	public int yGetter(int y)
	{
		return y;
	}
	
	public void draw()
	{
		System.out.println("점 [x = "+ x + ", y = " + y +"]를 그렸습니다.");
	}
}


