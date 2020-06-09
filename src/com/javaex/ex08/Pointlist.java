package com.javaex.ex08;

import java.util.Arrays;

public class Pointlist {
	private Point PA[];
	private int i=0;
	
	public Pointlist()
	{
		PA = new Point[3];
	}
	
	public void Add(Point p)
	{
		PA[i]=p;
		i++;
	}
	
	public int size()
	{
		return i;
	}

	@Override
	public String toString() {
		return "Pointlist [PA=" + Arrays.toString(PA) + ", i=" +  i+ "]";
	}
	
	

}
