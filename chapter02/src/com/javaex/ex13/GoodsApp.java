package com.javaex.ex13;

public class GoodsApp {

	public static void main(String[] args)
	{
		Goods com = new Goods("LG그램", 1000000);
		Goods fur = new Goods("머그컵", 2000);
		Goods ca = new Goods("Nikon", 400000);

		Goods[] goodsA = new Goods[3];
			
		goodsA[0] = com;
		goodsA[1] = fur;
		goodsA[2] = ca;
		
		for(int i=0; i<goodsA.length;i++)
		{
			goodsA[i].showinfo();
		}
	}
}
