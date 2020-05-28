package com.javaex.ex05;

public class GoodsApp {
	public static void main(String[] args)
	{
		
		Goods camera = new Goods();
		camera.setName("Nikon");
		camera.setPrice(400000);
		System.out.println(camera.toString());
		/*
		Goods a = new Goods();
		a.setName("aaaa");
		a.setPrice(3000);
		System.out.println(a.toString());
		*/
		Goods cup = new Goods("mug cup", 2000);
		System.out.println(cup.toString());
		Goods computer = new Goods("lg gram", 1000000);
	}
}
