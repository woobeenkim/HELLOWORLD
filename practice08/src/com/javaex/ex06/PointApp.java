package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);	
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));
		System.out.println(p2.hashCode());
		System.out.println(p1.hashCode());
		System.out.println(p4.hashCode());
	}

}
/*  Object내에 있는 메소드 equals는 선언이 된 포인트 들인 p1,p2,p3,p4의
  	메모리 내의 내용이아닌 각 포인트들의 메모리 주소를 비교한다.
   지금 1번째의 프린트값이 false 가 나온 이유는 p1, p2의 내용물을 비교한 것 이아닌
   메모리 주소를 비교하기 때문이다.
   4번쨰프린트 값이 true인 이유는 p4에 p1의 주소를 넘겼기 떄문에
   p4는 지금 p1을 가르키고 있기 떄문이다.
   hashCode가 진짜 메모리의 주소를 보여주는 것은 아니지만 p1,p2의 주소를 보면
   서로 같은 값을 넣었지만 주소가 다르기때문에 equals에서 false가 나오는 것을 알 수 있다.
  
 




*/