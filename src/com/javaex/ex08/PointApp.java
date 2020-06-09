package com.javaex.ex08;

public class PointApp {
	public static void main(String[] args)
	{
		Mylist Pl = new Mylist();
		Mylist Cl = new Mylist();
		Pointlist Pl1 = new Pointlist();

		Point p1 = new Point(1,1);
		Point p2 = new Point(2,2);
		Point p3 = new Point(3,3);

		Circle c1 = new Circle(2);
		Circle c2 = new Circle(3);
		Circle c3 = new Circle(4);
		Pl.Add(p1);
		Pl.Add(p2);
		Pl.Add(p3);
		Cl.Add(c1);
		Cl.Add(c2);
		Cl.Add(c3);
		Pl1.Add(p1);
		Pl1.Add(p2);
		Pl1.Add(p3);
		
		System.out.println(Pl.toString());
		System.out.println(Cl.toString());
		System.out.println(Pl1.toString());
		
		
	}
		
}
