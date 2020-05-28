package com.javaex.ex03;

public class StringApp {
	public static void main(String[] args)
	{
		String s01 = new String("hi");
		String s02 = new String("hi");
		
		System.out.println(s01==s02); //주소가 다름
		System.out.println(s01.hashCode()==s02.hashCode()); //hashCode는 주소가 아니다.
		System.out.println(s01.hashCode());
		System.out.println(s02.hashCode());

		String s03 = "hello";
		String s04 = "hello";
		
		System.out.println(s03==s04); //같은 주소
		System.out.println(s03);
		System.out.println(s04);
		System.out.println(s03.hashCode());
		System.out.println(s04.hashCode());
		
		s04 = "hello!!!!!!!!!!!!!!!!!!";

		System.out.println(s03==s04);
		System.out.println(s03);
		System.out.println(s03);

	}
}
