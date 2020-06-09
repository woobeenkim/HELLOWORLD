package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class Ex01 {
	public static void main(String[] args) throws IOException
	{
		InputStreamReader ir1 = new InputStreamReader(System.in,"UTF-8");
		BufferedReader bfr1 = new BufferedReader(ir1);
		Writer fw = new FileWriter("C:\\javaStudy\\file\\song.text");
		BufferedWriter bfw = new BufferedWriter(fw);
		String str = bfr1.readLine();
		bfw.write(str);
		
		bfr1.close();
		bfw.close();
	}
}
