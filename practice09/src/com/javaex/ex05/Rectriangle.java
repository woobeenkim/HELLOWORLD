package com.javaex.ex05;

public class Rectriangle extends Shape{
	
	private double width, height;
	

	public Rectriangle(double width, double height)
	{
		this.width =width;
		this.height =height;
	}
	
	public double getArea()
	{
		return width*height*0.5;
	}
	
	public double getPerimeter()
	{
		double result = width+ height+ Math.sqrt((width*width)+(height*height));
		return result;
	}

}
