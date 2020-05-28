package com.javaex.ex03;

public class StringApp1 {
	public static void main(String[] args)
	{
		String a = new String("abcd");
		String b = new String(", efg");
		
		a=a.concat(b);
		System.out.println(a.concat(b));
		System.out.println(a);

		System.out.println("=========================");
		a = a.trim();
		System.out.println("----"+a+"----");
		System.out.println(a);

		System.out.println("=========================");
		System.out.println(a.replace("ab","12"));
		System.out.println(a);

		System.out.println("=========================");
		String[] sA = a.split(",");
		for(int i=0; i<sA.length;i++)
		{
			System.out.println(sA[i]);
		}
		System.out.println("=========================");
		String str = "Hello java!";
		System.out.println(str.substring(3));

		System.out.println(str.substring(1,3));
		

		System.out.println("=========================");
		
		String s1 = "abc";
		String s2 = "efg";
		
		if(s1==s2)
			//s1==s2는 주소 비교
			//s1.equals(s2)는 문자열 비교.
			{
			System.out.println("문자열이 같다");
		}
		else
		{
			System.out.println("문자열이 다르다");
		}
	}
}
