package com.javaex.ex04;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String track;
	private int year;
	
	
	public void tsetter(String t)
	{
		title = t;
	}
	public String tgetter()
	{
		return title;
	}
	public void arsetter(String ar)
	{
		artist = ar;
	}
	public String argetter()
	{
		return artist;
	}
	public void alsetter(String al)
	{
		album = al;
	}
	public String algetter()
	{
		return album;
	}
	public void comsetter(String com)
	{
		composer = com;
	}
	public String comgetter()
	{
		return composer;
	}
	public void ysetter(int y)
	{
		year = y;
	}
	public int ygetter()
	{
		return year;
	}
	public void trsetter(String tr)
	{
		track = tr;
	}
	public String trgetter()
	{
		return track;
	}
	public void showinfo()
	{
		System.out.println(artist + ", " + title + " (" + album + ", " + year+ ", " + track+ ", " + composer +" 작곡 )");
	}
}
