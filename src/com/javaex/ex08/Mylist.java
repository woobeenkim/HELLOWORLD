package com.javaex.ex08;

import java.util.Arrays;

public class Mylist<T> {

	private  T[] OA;
	private int i=0;
	
	public Mylist()
	{
		OA = (T[])new Object[3];
	}
	
	public void Add(T obj)
	{
		OA[i] = obj;
		i++;
	}
	
	public int size()
	{
		return i;
	}

	@Override
	public String toString() {
		return "Mylist [OA=" + Arrays.toString(OA) + ", i=" + i + "]";
	}
	
	
}
