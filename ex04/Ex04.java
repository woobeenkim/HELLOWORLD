package com.javaex.ex04;

public class Ex04 {
	public static void main(String[] args)
	{
		int num=5;
		/*
		for(int a=0; a<=num; a++)
		{
			for(int b=num-1; b<=a; b--)
			{
			System.out.print("");
			}
			for(int b=0; b<2*a+1;b++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		*/
		for(int i=0; i<5; i++){

			for(int j=0; j<=5-i; j++){

				System.out.print(" ");

			}

			for(int k=0; k<=i*2; k++){

				System.out.print("*");

			}

			System.out.println();

		}

		for(int i=3; i>=0; i--){

			for(int j=i; j<=5; j++){

				System.out.print(" ");

			}

			for(int k=0; k<=i*2; k++){

				System.out.print("*");

			}

			System.out.println();

		}
	}
}
