package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User jws = new Customer("jws", "j1234","정우성",1000);
		User yjs = new Customer("yjs", "y2345","이효리",2000);
		User master = new Employee("master","m7778", "운영자",5000000);
		jws.showinfo();
		yjs.showinfo();
		master.showinfo();
	}

}
