package com.javaex.ex01;

public class Ex08 {
	public static void main(String[] args) {
		int a = 7;
		int b = 2;
		
		System.out.println("산술연산자");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println("부호연산자");
		int var = -3;
		int pvar = +var;
		System.out.println(pvar);
		pvar = -pvar;
		System.out.println(pvar);
		
		System.out.println("증감연산자");
		System.out.println(a);
		System.out.println(++a);
		System.out.println(b);
		System.out.println(--b);
		System.out.println(a++);
		System.out.println(a);
		
	}
}
