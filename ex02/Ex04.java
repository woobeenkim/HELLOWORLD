package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		String name;
		int age;
		double height;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��� �ּ���");
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.println("���̸� �Է��� �ּ���");
		System.out.print("���� : ");
		age = sc.nextInt();
		System.out.println("Ű�� �Է��� �ּ���");
		System.out.print("Ű : ");
		height = sc.nextDouble();
		
		System.out.println("����� �̸��� " + name + " ���̴� " + age + " Ű�� " + height + " �Դϴ�.");
		
	}
}
