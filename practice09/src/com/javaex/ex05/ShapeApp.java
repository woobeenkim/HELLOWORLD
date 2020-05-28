package com.javaex.ex05;

import java.util.ArrayList;

public class ShapeApp {

	public static void main(String[] args)
	{
		ArrayList<Shape> SA = new ArrayList<Shape>();
		Shape r1 = new Rectangle(5,6);
		Shape rt1 = new Rectriangle(6,2);
		
		SA.add(r1);
		SA.add(rt1);
		
		for(int i=0; i<SA.size();i++)
		{
			System.out.println(SA.get(i).getArea());
			System.out.println(SA.get(i).getPerimeter());
			
			if(SA.get(i) instanceof Resizeable)
			{	
				((Resizeable)SA.get(i)).resize(0.5);
				System.out.println(SA.get(i).getArea());
				System.out.println(r1.getPerimeter());
				
			}
		}
	}
}
