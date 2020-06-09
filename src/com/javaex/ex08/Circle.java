package com.javaex.ex08;

public class Circle {
	private int radius;
	
	public Circle(int radius) 
	{
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void draw()
	{
		System.out.println("원의 반지름 : "+radius);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
