package com.javaex.ex13;

public class Goods {
	private String name;
	private int price;
	static int countGoods;
	
	//생성자
	public Goods(String name, int price)
	{
		this.name = name;
		this.price = price;
	}
	public Goods(){}
	
	//G/S
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getCountGoods() {
		return countGoods;
	}
	public static void setCountGoods(int countGoods) {
		Goods.countGoods = countGoods;
	}
	
	//일반 메소드
	public void showinfo()
	{
		System.out.println("제품명 : "+ name+ "  가격 : "+price);
	}
	
	//toString()
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

	
	
}
