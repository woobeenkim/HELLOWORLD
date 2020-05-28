package com.javaex.ex03;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간을 입력해주세요 : ");
		int time = sc.nextInt();
		int pay;
		if(time>8)
		{
			pay = 8*10000 + (time-8)*12000;
			System.out.print("임금은" + pay +"원입니다.");
		}
		else
		{
			pay = time*10000;
			System.out.print("임금은" + pay +"원입니다.");
		}
		sc.close();
	}
	

}
