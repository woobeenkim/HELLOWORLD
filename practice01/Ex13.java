package com.javaex.practice01;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a, w, d;
		d = 1230.95;
		System.out.print("환전할 원화를 입력하세요 : ");
		a = sc.nextInt();
		w = a / d;
		System.out.println("받으실 달러는 "+ w +"입니다.");
	}
}
