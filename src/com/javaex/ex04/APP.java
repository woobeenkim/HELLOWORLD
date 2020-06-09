package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class APP {
	public static void main(String[] args) throws IOException
	{
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB.txt");
		InputStreamReader ir = new InputStreamReader(in,"UTF-8");
		BufferedReader bfr = new BufferedReader(ir);
		InputStreamReader ir1 = new InputStreamReader(System.in,"UTF-8");
		BufferedReader bfr1 = new BufferedReader(ir1);
		Writer fw = new FileWriter("C:\\javaStudy\\file\\PhoneDB.txt",true);
		BufferedWriter bfw = new BufferedWriter(fw);
		
	
		

		List<Person> PL = new ArrayList<Person>();
		
		while(true)
		{
			String str = bfr.readLine();
			try {
			String[] s = str.split(",");
			Person a = new Person(s[0],s[1],s[2]);
			PL.add(a);
			}
			catch(NullPointerException N){
				
			}
			if(str==null)
			{
				break;
			}
				
		}
		for(Person p :PL)
		{
			p.showinfo();
		}
		
		String str = bfr1.readLine();
		bfw.write(str);

		

		bfr1.close();
		bfw.close();
		bfr.close();
		ir.close();
		in.close();
	}
}
