package com.javaex.ex05;

public class Goods {
	String name;
	int price;

	public Goods() {}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
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
	
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	
}
