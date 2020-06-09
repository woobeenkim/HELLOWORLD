package com.javaex.ex06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AgeApp {
	public static void main(String[] args)
	{
		Map<String, Integer> agemap = new HashMap<String, Integer>();	
		//자료형 맞춰주기.
		Integer i1 = new Integer(30);
		Integer i2 = new Integer(40);
		Integer i3 = new Integer(20);

		agemap.put("정우성",i1);
		agemap.put("이효리",i2);
		agemap.put("유재석",i3);
		
		System.out.println(agemap.toString());
		
		agemap.remove("유재석");

		System.out.println(agemap.toString());
		
		agemap.put("이효리",210);

		System.out.println(agemap.toString());

		agemap.put("이정재",45);

		System.out.println(agemap.toString());
		

		Integer a = agemap.get("이정재");
		
		System.out.println(a);
		
		int count = agemap.size();
		
		System.out.println(count);
		
		Set<String> keys = agemap.keySet();
		for(String k : keys)
		{
			System.out.println(k.toString());
			System.out.println(k + " : " + agemap.get(k));
			// String k 는 각자의 이름 키이고, agemap.get(k)는 그 이름의 키가 가르키는 값을 의미
			
		}
	}
}
