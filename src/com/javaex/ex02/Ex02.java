package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {
	public static void main(String[] args) throws IOException
	{
		Reader fr = new FileReader("C:\\javaStudy\\file\\ms949.txt");
		BufferedReader bfr = new BufferedReader(fr);
		
		while(true)
		{
			String str = bfr.readLine();
			if(str == null)
			{
				break;
				
			}
			System.out.println(str);
		}
	bfr.close();
	}

}
