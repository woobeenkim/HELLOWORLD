package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
    	if("앱".equals(str))
    	{
    		startApp();
    	}
    	else if("음악".equals(str)){
             startMusic();
         }else{
             super.execute(str);
         }
        
    }
 
    public void startApp()
    {
    	System.out.println("앱실행");
    }
    public void startMusic()
    {
    	System.out.println("다운로드해서 음악재생");
    }
    //메소드작성
    
    //메소드작성
    
    
    
}
