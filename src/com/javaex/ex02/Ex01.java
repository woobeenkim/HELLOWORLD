package com.javaex.ex02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2345;
		double d = 3.14;
		String str = "굿모닝";
		char c = '한';
		String s = "한";
		
		String name = "유재학";
		
		System.out.println("안녕하세요");
		System.out.println(name);
		System.out.println("name");
		
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println(str);
		System.out.println(str+str);
		
		System.out.println(i + str);
		System.out.println(d + str);
		System.out.println(c + str);
		System.out.println(str + " 랑 ");
		
		System.out.println("제 이름은 " + name + " 입니다.");
		System.out.println("제 이름은 \"" + name + "\" 입니다.");
		System.out.println("제 이름은 \t" + name + "\t 입니다.");
		System.out.println("제 이름은 \\" + name + "\\ 입니다.");
		System.out.println("제 이름은 \n" + name + "\n 입니다.");	
	}
}
