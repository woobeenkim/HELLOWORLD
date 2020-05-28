package com.javaex.ex08;

public class Point {
	private int x;
	private int y;
	//생성자
	public Point()
	{
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//g/s
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
	
	
	//메소드
	//draw() 1번
	public void draw()
	{
		System.out.println(x+ ", "+ y+ "를 그렸습니다.");
	}
	//draw() 2번

	public void draw(boolean action)
	{
		if(action == true)
		{
		System.out.println(x+ ", "+ y+ "를 그렸습니다.");
		}
		else
		{
			System.out.println(x+ ", "+ y+ "를 지웠습니다.");
		}
	}

	@Override
	public String toString() {
		return "Point [x= " + x + ", y=" + y + "]";
	}
	
	//toString()
	
	
	

}
