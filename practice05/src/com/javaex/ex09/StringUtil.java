package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] strArray){
       String s="";
        //메소드 내용작성
      for(int i=0;i<3;i++)
      {
    	  s = s + strArray[i]; 
      }
      return s;
    }

}
