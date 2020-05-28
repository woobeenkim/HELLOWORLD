package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.println("이름을 입력해 주세요");
		System.out.print("이름 : ");
		name = sc.nextLine();
		sc.close();
		System.out.println("당신의 이름은 " + name + " 입니다");
	}

}
