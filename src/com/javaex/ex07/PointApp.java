package com.javaex.ex07;

import java.util.HashMap;
import java.util.Map;

public class PointApp {
	public static void main(String[] args)
	{
		Map<String,Point> PM = new HashMap<String, Point>();
		Point p1 = new Point(1,1);
		Point p2 = new Point(2,2);
		Point p3 = new Point(3,3);

		PM.put("정우성", p1);
		PM.put("유재석", p2);
		PM.put("이효리", p3);
		
		Point p = PM.get("정우성");
		System.out.println(p.getY());
		System.out.println(PM.get("정우성").getY());
		System.out.println(PM.toString());
		
		
	}
}
