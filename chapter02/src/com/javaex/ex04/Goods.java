package com.javaex.ex04;

public class Goods {
	
	private String name;
	private int price;
	
	public void setName(String n)
	{
		name = n;
	}
	public String getName()
	{
		return name;
	}
	public void setPrice(int p)
	{
		price =p;
	}
	public int getPrice()
	{
		return price;
	}
	public void showinfo()
	{
		System.out.println("제품명 : " + name);
		System.out.println("가격 : " + price);
	}
}
