package com.javaex.ex03;

public class REctangle1 {
	
		private int width;
		private int height;
		
		public REctangle1() {}
		
		public REctangle1(int width, int height)
		{
			this.width = width;
			this.height = height;
		}

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}
		
		public void showinfo()
		{
			System.out.println("가로 : "+ width + ", 세로 : "+ height);
		}
		
		public boolean equals(Object obj)
		{
			REctangle1 r = (REctangle1)obj;
			if(r.width*r.height == this.width*this.height)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
}
