package com.javaex.ex01;

public class Mylist<T> {
	private T[] OA;
	private int i=0;
	
	public Mylist() 
	{
		OA = (T[])new Object[3];
	}
	
	public void add(T o)
	{
		OA[i]=o;
		i++;
	}
	
	public int size()
	{
		return i;
	}
	
}
