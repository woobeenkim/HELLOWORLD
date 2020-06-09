package com.javaex.ex07;

public class Point {

	private int x, y;
	
	public Point() {}
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y =y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void draw()
	{
		System.out.println("[점] x좌표 : "+ x + ", y좌표 : " + y );
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
