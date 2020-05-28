package com.javaex.ex07;

public class SongApp {
	public static void main(String[] args)
	{

		Song a = new Song();	
		a.setTitle("좋은날");
		a.setArtist("아이유");
		a.setAlbum("Real");
		a.setComposer("이민수");
		a.setYear(2010);
		a.setTrack(3);
		a.Showinfo();
		
		Song iu = new Song("아이유", "좋은날", "Real", "이민수", 2010, 3);
		Song bigbang = new Song("BIGBANG", "거짓말", "Always", "G-DRAGON", 2007, 2);
		Song busker = new Song("버스커버스커", "벚꽃엔딩", "버스커버스커1집", "장범준", 2012, 4);
		
		iu.Showinfo();
		bigbang.Showinfo();
		busker.Showinfo();
		
		
		
		
	}
}
