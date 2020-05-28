package com.javaex.ex04;

public class GoodsApp {
	public static void main(String[] args)
	{
		Goods camera = new Goods();
		Goods Fur = new Goods();
		
		camera.setName("Nikon");
		Fur.setName("머그컵");
		camera.setPrice(900000);
		Fur.setPrice(2000);
		
		camera.showinfo();
		Fur.showinfo();
		
		
	}
}
