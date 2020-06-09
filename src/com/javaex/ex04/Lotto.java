package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Lotto {
	public static void main(String[] args)
	{

		Set<Integer> iset = new HashSet<Integer>(); 
		
		
		while(true)
		{
			if(iset.size()<6)
				
			{
				int a = (int)(Math.random() * 45) + 1;
				iset.add(a);
			}
			else
			{
				break;
			}
		}
	
		
		for(Integer i : iset)
		{
			System.out.println(i.toString());
		}
		
		
	}
}
