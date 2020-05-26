package com.javaex.ex07;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//equals() 메소드를 작성하세요.
	public boolean equals(Object obj)
	{
		Point o = (Point)obj;
		if(o.x==this.x)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
}

//x좌표의 값만 같으면 같다를 표현.
