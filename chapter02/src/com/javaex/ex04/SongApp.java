package com.javaex.ex04;

public class SongApp {
	public static void main(String[] args)
	{
		Song iu = new Song();
		Song bigbang = new Song();
		Song busker = new Song();
		
		iu.arsetter("아이유");
		iu.tsetter("좋은날");
		iu.alsetter("Real");
		iu.ysetter(2010);
		iu.trsetter("3번 track");
		iu.comsetter("이수만");
		bigbang.arsetter("BIGBANG");
		bigbang.tsetter("거짓말");
		bigbang.alsetter("aLWAYS");
		bigbang.ysetter(2007);
		bigbang.trsetter("2번 track");
		bigbang.comsetter("G-DRAGON");
		busker.arsetter("버스커버스커");
		busker.tsetter("벚꽃엔딩");
		busker.alsetter("버스커버스커1집");
		busker.ysetter(2012);
		busker.trsetter("4번 track");
		busker.comsetter("장범준");
		
		iu.showinfo();
		bigbang.showinfo();
		busker.showinfo();
	}
}
