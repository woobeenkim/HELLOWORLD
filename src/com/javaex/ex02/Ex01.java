package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Ex01 {
	public static void main(String[] args) throws IOException
	{
		Writer fw = new FileWriter("C:\\javaStudy\\file\\song.text");
		BufferedWriter bfw = new BufferedWriter(fw);
		Reader fr = new FileReader("C:\\javaStudy\\file\\song.text");
		BufferedReader bfr = new BufferedReader(fr);
		String s = "학교종이 땡떙떙";
		
		bfw.write(s);
		bfw.newLine();
		bfw.write("어서 모이자");
		bfw.newLine();
		bfw.write("선생님이 우리를");
		bfw.newLine();
		bfw.write("기다리신다");
		bfw.close();
		
		while(true)
		{
			String data = bfr.readLine();
			if(data == null)
			{
				break;
			}
			
		}

		
	}
}
