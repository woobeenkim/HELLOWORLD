package com.javaex.ex10;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public TV(int c, int v, boolean p)
	{
		this.channel = c;
		this.volume = v;
		this.power = p;
	}
	//g/s
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public void power(boolean power)
	{
		if(power == true)
		{
			this.power = true;
		}
		else
		{
			this.power = false;
		}
	}
	public void channel(int a)
	{
		if(a<1)
		{
			this.channel = 1;
		}
		else if(a>255)
		{
			this.channel = 255;
		}
	}
	public void channel(boolean channel)
	{
		if(channel == true)
		{
			this.channel +=1;
		}
		else
		{
			this.channel -=1;
		}
	}
	public void volume(int b)
	{
		if(b<0)
		{
			this.volume = 0;
		}
		else
		{
			this.volume = 100;
		}
	}
	public void volume(boolean volume)
	{
		if(volume == true)
		{
			this.volume += 1;
		}
		else
		{
			this.volume -= 1;
		}
	}
	public void status()
	{
		if(this.power==true)
		{
		System.out.println("TV는 지금 켜져있습니다." + "채널은 지금 "+this.channel+ "번입니다, 소리는 지금" + this.volume +"입니다.");
		}
		else
		{
			System.out.println("TV는 지금 꺼져있습니다." + "채널은 지금 "+this.channel+ "번입니다, 소리는 지금" + this.volume +"입니다.");
		}
	}
	
}
