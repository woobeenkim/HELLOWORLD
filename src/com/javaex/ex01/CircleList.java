package com.javaex.ex01;

public class CircleList {
	
	private Circle CA[];
	private int  i=0;
	
	public CircleList()
	{
		CA = new Circle[3];
	}
	
	public void add(Circle c)
	{
		CA[i] = c;
		i++;
	}
	
	public int size()
	{
		return i;
	}
}
