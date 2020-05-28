package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	ArrayList<Friend> FA = new ArrayList<Friend>();
    	
    	System.out.println("친구를 3명 등록해 주세요.");
    	for(int i =0; i<3;i++)
    	{
    		String name, hp, school;
    		name = sc.next();
    		hp = sc.next();
    		school = sc.next();
    		FA.add(new Friend(name,hp,school));
    	}
    	
    	for(Friend f : FA)
    	{
    		f.showinfo();
    	}
    }

}
