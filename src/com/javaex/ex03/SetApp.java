package com.javaex.ex03;

import java.util.HashSet;
import java.util.Set;

public class SetApp {
	public static void main(String[] args)
	{
		Set<Integer> iset = new HashSet<Integer>(); 
		
		Integer i1 = new Integer(3);
		Integer i2 = new Integer(5);
		Integer i3 = new Integer(7);
		Integer i4 = new Integer(10);

		iset.add(i1);
		iset.add(i2);
		iset.add(i3);
		iset.add(i4);
		
		for(Integer i : iset)
		{
			System.out.println(i.toString());
		}
		
		iset.remove(i1);
		System.out.println("=========================");
		for(Integer i : iset)
		{
			System.out.println(i.toString());
		}
	}
}
