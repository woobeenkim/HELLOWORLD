package com.javaex.ex09;

public class Rectangle {
	private int width, height;
	
	public Rectangle() {}
	
	public Rectangle(int width, int height) 
	{
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	public void draw()
	{
		System.out.println("가로 : "+ width+ ", 세로 : "+ height);
		
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	

}
