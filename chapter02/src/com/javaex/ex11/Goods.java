package com.javaex.ex11;

public class Goods {
	private String name;
	private int price;
	public static int countGoods;
	//static을 사용하면 공용으로 사용하게 된다.
	// 이 예제에서 만약 countGoods에 static을 주지 않으면 각자 한개의
	//countGoods를 갖고 있기때문에 카운트가 1개에서 더해지지 않는다.
	//이럴경우 처음 변수 선언시 static속성을 넣어주면 각각의 Goods의 countGoods의 개수를
	//카운트 가능하다. ※ 메모리를 공용으로 사용
	//생성자
	public Goods() {}
	public Goods(String name, int price)
	{
		this.name = name;
		this.price = price;
		this.countGoods += 1;
	}
	
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
	public int getCountGoods() {
		return countGoods;
	}
	public void setCountGoods(int countGoods) {
		this.countGoods = countGoods;
	}
	
	//메소드
	
	
	//toString()
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countGoods=" + countGoods + "]";
	}
	
}
