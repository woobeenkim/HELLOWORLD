package com.javaex.ex01;

public class GoodsApp {
	public static void main(String[] args)
	{
		Goods camera = new Goods();
		
		camera.name = "Nikon";
		camera.price = 400000;
		
		System.out.println("상품이름 : " + camera.name);
		System.out.println("가격 : " + camera.price);
		
	}
}
