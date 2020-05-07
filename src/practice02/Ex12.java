package practice02;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String c;
		int a, b;
		float d;
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호 : ");
		c = sc.next();
		System.out.print("숫자1 : ");
		a = sc.nextInt();
		System.out.print("숫자2 : ");
		b = sc.nextInt();
		
		if(a!=0 || b!=0)
		{
			switch(c)
			{
			case "+":
				d=a+b;
				System.out.print("결과는 : " + d);
				break;
			case "-":
				d=a-b;
				System.out.print("결과는 : " + d);
				break;
			case "/":
				if(b==0)
				{
				System.out.println("계산할 수 없습니다.");
				}
				else
				{
				d=a/b;
				System.out.print("결과는 : " + d);
				}
				break;
			case "*":
				d=a*b;
				System.out.print("결과는 : " + d);
				break;
				default:
				System.out.print("계산할 수 없는 기호입니다.");
				break;
			}
		}
		else
		{
			System.out.print("계산할 수 없습니다.");
		}
	}
}
