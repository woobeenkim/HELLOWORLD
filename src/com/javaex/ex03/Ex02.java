package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex02 {
	public static void main(String[] args)throws IOException
	{
		InputStreamReader ir = new InputStreamReader(System.in,"UTF-8");
		BufferedReader bfr = new BufferedReader(ir);
		//System.in
		/*
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine();
		 같은 의미
		 */
		OutputStreamWriter ow = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(ow);
		//System.out
		/*
		 //System.out.println(str);
		  이랑 같은 의미
		*/
		
		String str = bfr.readLine();
		bw.write(str);
		
		bfr.close();
		bw.close();
		
	}
}
