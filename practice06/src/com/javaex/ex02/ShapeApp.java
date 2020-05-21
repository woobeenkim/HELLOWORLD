package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("파랑", "파랑");
		System.out.println("================");
		
		Triangle t1 = new Triangle();
		System.out.println("================");
		
		Triangle t2 = new Triangle(3, 4);
		System.out.println("================");
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println("================");
		
	}

}

/*
 s1은 shape 면색과 선색을 넣엇음으로 shape(2) 출력
 t1은 triagnle을 생성만 하여 shape(0)다음 triagnle(0) 출력
 t2는 파라미터를 숫자3,4만 갖고 있지만 triagnle에서 가로세로만 받는
 생성자는 자동으로 검정검정이라는 면색과선색을 줌으로 shape(2)다음 triagle(2) 출력
 t3은 모든파라미터를 갖고 있어 shape(2)와 triagnle(4)를 출력
 
 
  */ 