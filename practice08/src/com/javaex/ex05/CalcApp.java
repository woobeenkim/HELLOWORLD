package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String c;
    	int a, b;
    	System.out.print(">>");
    	c = sc.nextLine();
    	String[] re = c.split("\\s");
	
			if(re[1].equals("+"))
			{
				a = Integer.parseInt(re[0]);
				b = Integer.parseInt(re[2]);
				Add add = new Add();
				System.out.println(add.calculate(a,b));
			}
			
			else if(re[1].equals("-"))
			{
				a = Integer.parseInt(re[0]);
				b = Integer.parseInt(re[2]);
				
				Sub sub = new Sub();
				System.out.println(sub.calculate(a,b));
			}
			else if(re[1].equals("/"))
			{
				a = Integer.parseInt(re[0]);
				b = Integer.parseInt(re[2]);
				Div div = new Div();
				System.out.println(div.calculate(a,b));
			}
			else if(re[1].equals("*"))
			{
				a = Integer.parseInt(re[0]);
				b = Integer.parseInt(re[2]);
				Mul mul = new Mul();
				System.out.println(mul.calculate(a,b));
			}
		
    	
    }
}
