package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	ArrayList<Goods> AA = new ArrayList<Goods>();
    	int sum = 0;

    	System.out.println("상품을 입력해주세요(Q)");
    	while(true)
    	{
    		String a = sc.nextLine();
	    	String[] re = a.split(",");
	    	if(a !="Q")
    		{
	    		try
	    		{
	    			Goods g = new Goods(re[0],Integer.parseInt(re[1]),Integer.parseInt(re[2]));
		    		AA.add(g);
	    		}
	    		catch(IndexOutOfBoundsException e)
	    		{
	    			System.out.println("[등록완료]");
		    		break;
	    		}
    			
    		}
    		
    	}
    	for(Goods g : AA)
		{
			g.showinfo();
			sum += g.getCount();
		}
    	System.out.println("모든 상품의 갯수는 "+sum+"개입니다.");
    	
    	
    	
	
		
		
    	
		
       
    }

}
