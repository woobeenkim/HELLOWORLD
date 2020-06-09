package com.javaex.ex09;

import java.util.ArrayList;
import java.util.List;


public class App {
	public static void main(String[] args)
	{
		List<Point> pl = new ArrayList<Point>();
		List<Rectangle> rl = new ArrayList<Rectangle>();		
		Point P1 = new Point(3,3);
		Point P2 = new Point(4,4);
		Point P3 = new Point(5,5);
		
		Rectangle R1 = new Rectangle(4,4);
		Rectangle R2 = new Rectangle(5,5);
		Rectangle R3 = new Rectangle(6,6);

		pl.add(P1);
		pl.add(P2);
		pl.add(P3);
		rl.add(R1);
		rl.add(R2);
		rl.add(R3);
		for(Rectangle R : rl)
		{
			R.draw();
		}
		for(Point P : pl)
		{
			P.draw();
		}
	}
}
