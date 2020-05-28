package com.javaex.ex06;

public class PointApp {
	public static void main(String[] args)
	{
		//디폴트 생성자를 이용해서 인스턴스 생성.
		//setter로 입력
		//toString() 확인
		
		Point x = new Point();
		x.setX(5);
		x.setY(6);
		System.out.println(x.toString());
		//x ,y 같이 세팅하느 생성자 이용 -->추가 생성
		// toString() 확인 -> 오류 날 거임.
		// 오류제거를 위하여 디폴트 생성자 만들기.
		Point p = new Point(10,10);
		p.draw();
	}
}

