package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	  public static void main(String[] args) {
	    	int i=0;
	        Friend[] friendArray = new Friend[3];
	        Scanner sc = new Scanner(System.in);
	        String c;
	        // 문자열을 받기위한 c
	        
	    	
	        System.out.println("친구를 3명 등록해 주세요");

	        while(i<3)
	        {
	        	Friend friend = new Friend();
	        	c = sc.nextLine();
	        	String[] re = c.split("\\s");
	        	friend.setName(re[0]);
	        	friend.setHp(re[1]);
	        	friend.setSchool(re[2]);
	        	friendArray[i]=friend;
	        	i++;
	        // friend를 만들어서 각각의 정보를 입력후 
	        // friendArray첫번째 방부터 정보 저장하고 마지막 저장시 종료
	        }
	             
	        // 친구정보 출력
	        for (i = 0; i < friendArray.length; i++) {
	            //친구정보 출력 메소드 호출
	        	friendArray[i].showInfo();
	        }
	        

	        sc.close();
	    }
	
	
}
