package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;


public class App {
	public static void main(String[] args)throws IOException
	{
		InputStream is = new FileInputStream("c:\\javaStudy\\file\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(is,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		InputStreamReader isr1 = new InputStreamReader(System.in,"UTF-8");
		BufferedReader br1 = new BufferedReader(isr1);
		Writer fw = new FileWriter("c:\\javaStudy\\file\\PhoneDB.txt",true);
	
		
		List<Person> PL = new ArrayList<Person>();
		
		while(true)
		{
			String str = br.readLine();
			try {
				String[] s = str.split(",");
				Person p = new Person(s[0],s[1],s[2]);
				PL.add(p);
			}
			catch(NullPointerException n)
			{
			
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
		
	String str = br1.readLine();
	fw.write(str);
	fw.write("\n");
	
	is.close();
	isr.close();
	br.close();
	br1.close();
	isr1.close();
	fw.close();
	}
}
