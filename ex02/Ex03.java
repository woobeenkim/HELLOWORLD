package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("�̸��� �Է��� �ּ���");
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("���� : ");
		age = sc.nextInt();
		sc.close();
		System.out.println("����� �̸��� " + name + " ���̴� " + age + " �Դϴ�");
	}

}
