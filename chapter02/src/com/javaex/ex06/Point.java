package com.javaex.ex06;

public class Point {

	private int x;
	private int y;
	
	//같은 이름의 생성자들을 다른 방식으로ㅓ APP에서 실행시 필요한
	//생성자 속성 확인하기.
	
	/*
	  생성자를 2개 만들어야 하는 이유
	  2번째 생성자인 int x와 int y를 값으로 갖고 메모리에 올리는 생성자가
	  생성되는 순간 생성자 칸에 따로 지정하지 않은 1번째 포인트 생성자가
	  사라지게 된다. 자바는 같은 생성자가 값을 갖고 있지 않으면
	  메모리를 비우기 때문에 만약 이와 같이 함께 사용 또는
	  이해를 하고 싶으면 메모리에 대한 생각을 할 것! 또는 두생성자를 만들
	  어서 함께 사용해야 한다.
	*/
	//생성자
	public Point() {}
	
	public Point(int x, int y)
	{
		//메모리에 올리기.
		this.x = x;
		this.y = y;
	}
	
	// g/s
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	//일반 메소드
	public void draw()
	{
			System.out.println("[점 x = " + this.x + ", y = " + this.y + "]" );
	}
	//toString()
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
