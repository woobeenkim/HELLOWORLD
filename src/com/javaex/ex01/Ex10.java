package com.javaex.ex01;

public class Ex10 {
	public static void main(String[] args) {
		//��������
		int a = 5;
		int b = 7;
		
		System.out.println("&&������");
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		
		System.out.println("||������");
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		System.out.println("����");
		System.out.println((a>b)&&(a<b));
		System.out.println((a>b)||(a<b));
		
	}
}
