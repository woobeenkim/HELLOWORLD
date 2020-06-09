package com.javaex.ex01;

public class PointAp {
	
	public static void main(String[] args)
	{
		/*
			PointList pList = new PointList();
			CircleList cList = new CircleList();

			Point p1 = new Point(3,4);
			Point p2 = new Point(5,1);
			Point p3 = new Point(2,6);
			
			pList.add(p1);
			pList.add(p2);
			pList.add(p3);
			
			System.out.println(pList.size());
			
			Circle c1 = new Circle(2);
			Circle c2 = new Circle(3);
			Circle c3 = new Circle(4);
			
			cList.add(c1);
			cList.add(c2);
			cList.add(c3);
			
			System.out.println(cList.size());
		*/
		Mylist<Point> pList = new Mylist<Point>();
		//선언시 <자료형>을 붙여주면 범용으로 받는 리스트에서
		//특정 자료형만 받아준다.

		Point p1 = new Point(3,4);
		Point p2 = new Point(5,1);
		Point p3 = new Point(2,6);
		
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		System.out.println(pList.size());
		
		Mylist<Circle> cList = new Mylist<Circle>();
		
		Circle c1 = new Circle(2);
		Circle c2 = new Circle(3);
		Circle c3 = new Circle(4);
		
		cList.add(c1);
		cList.add(c2);
		cList.add(c3);
		
		System.out.println(cList.size());
	}
}
