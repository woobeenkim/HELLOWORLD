package com.javaex.ex01;

public class Circle {
	private int radius;
	
	public Circle(){}
	
	public Circle (int radius)
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
		System.out.println("[원] 반지름 :  "+ radius);
	}
	
	
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}

