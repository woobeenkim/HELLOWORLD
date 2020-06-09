package com.javaex.ex10;

import java.util.HashSet;
import java.util.Set;

public class App {
	public static void main(String[] args)
	{
		Set<Point> PS = new HashSet<Point>();

		Point p1 = new Point(1,1);
		Point p2 = new Point(2,2);
		Point p3 = new Point(3,3);
		Point p4 = new Point(3,3);

		PS.add(p1);
		PS.add(p2);
		PS.add(p3);
		PS.add(p4);
		
		for(Point p : PS)
		{
			p.draw();
		}
	}

}
