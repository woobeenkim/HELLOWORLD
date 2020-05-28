package com.javaex.ex03;

public class Rectangle {
	private int width;
	private int height;
	
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
	
	public void showinfo()
	{
		System.out.println("가로 : "+ width + ", 세로 : "+ height);
	}
	public boolean equals(Object obj)
	{
		Rectangle r = (Rectangle)obj;
		if((r.width==this.width)&&(r.height==this.height))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
