package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.println("�̸��� �Է��� �ּ���");
		System.out.print("�̸� : ");
		name = sc.nextLine();
		sc.close();
		System.out.println("����� �̸��� " + name + " �Դϴ�");
	}

}
