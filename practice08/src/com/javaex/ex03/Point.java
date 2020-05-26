package com.javaex.ex03;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
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
	

	public boolean equals(Object obj)
	{
		Point o =  (Point)obj;
		if((this.x == o.x) && (this.y == o.y))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//toString()을 작성 하세요
	@Override
	public String toString() {
		return "[포인트] x:"+x +", y:"+y ;
	}
	
	
}
