package com.javaex.ex02;

public class PointApp {
	public static void main(String[] args)
	{
		/*
		Point p1 = new Point(2,2);
		Point p2 = new Point(2,2);

		System.out.println(p1.getX());
		p1.draw();

		System.out.println(p1.getClass());
		System.out.println(p1.hashCode());
		System.out.println(p1.toString());
		System.out.println(p1.equals(p2));
		*/

		Point p1 = new Point(2,3);
		Point p2 = new Point(2,3);
		Point p3 = p1;

		System.out.println(p1==p2);
		System.out.println(p3==p1);
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p1));
		
		/* object의 toString()과 equals()로 p1과 p2를 비교한 결과
		같아야 하는 결과치가 다르다고 나옴
		우리가 생각한 결과값을 비교하는게 아닌 p1과 p2가 각각의 주소값을
		비교함으로 결과값 비교가 안나옴. 
		의도한 것과 같이 결과가 나오려면 Point클래스에서 toString()과 equals()메소드를
		다시 만들어 주기.
		*/
		
		
		
	}

}
