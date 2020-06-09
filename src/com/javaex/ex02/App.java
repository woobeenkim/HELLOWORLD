package com.javaex.ex02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
	public static void main(String[] args)
	{
		List<Point> PL = new ArrayList<Point>();
		List<Rectangle> RL = new LinkedList<Rectangle>();
		
		Point P1 = new Point(3,3);
		Point P2 = new Point(4,4);
		Point P3 = new Point(5,5);
		
		Rectangle R1 = new Rectangle(4,4);
		Rectangle R2 = new Rectangle(5,5);
		Rectangle R3 = new Rectangle(6,6);
		
		PL.add(P1);
		PL.add(P2);
		PL.add(P3);
		
		RL.add(R1);
		RL.add(R2);
		RL.add(R3);
		
		for(Rectangle r : RL)
		{
			r.draw();
		}
		
		for(Point p : PL)
		{
			p.draw();
		}
		
		
		System.out.println(PL.size());
		System.out.println(PL.get(1));
		System.out.println(P1.getX());
		P1.draw();
		

		System.out.println("====================================");
		
		for(int i=0; i<PL.size();i++)
		{
			PL.get(i).draw();
		}
		
		System.out.println(PL.toString());
		
		PL.remove(0);

		System.out.println(PL.toString());
		PL.remove(1);

		System.out.println(PL.toString());
		
		
	}
}
