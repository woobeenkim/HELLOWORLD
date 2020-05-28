package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2345;
		double d = 3.14;
		String str = "�¸��";
	//	char c = '��';
		String s = "��";
		
		String name = "������";
		
		System.out.println("�ȳ��ϼ���");
		System.out.println(name);
		System.out.println("name");
		
		System.out.print("�ȳ�");
		System.out.println("�ϼ���");
		
		System.out.println(str);
		System.out.println(str+str);
		
		System.out.println(i + str);
		System.out.println(d + str);
	//	System.out.println(c + str);
		System.out.println(str + " �� ");
		
		System.out.println("�� �̸��� " + name + " �Դϴ�.");
		System.out.println("�� �̸��� \"" + name + "\" �Դϴ�.");
		System.out.println("�� �̸��� \t" + name + "\t �Դϴ�.");
		System.out.println("�� �̸��� \\" + name + "\\ �Դϴ�.");
		System.out.println("�� �̸��� \n" + name + "\n �Դϴ�.");	
	}
}
