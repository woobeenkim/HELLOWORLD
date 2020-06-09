package com.javaex.ex01;

public class PointList {
	
	private Point[] PA;
	private int i=0;
	
	public PointList()
	{
		PA = new Point[3];
	}
	
	public void add(Point p)
	{
		PA[i]=p;
		i++;
	}
	
	public int size()
	{
		return i;
	}
}
