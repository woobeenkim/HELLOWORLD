package com.javaex.ex05;

public class Depart extends Employee{

	 private String dpname;
	 
	 public Depart() {}
	 public Depart(String dpname)
	 {
		 this.dpname = dpname;
	 }
	 public Depart(String name, int salary, String dpname)
	 {
		 super(name, salary);
		 this.dpname = dpname;
	 }
	 
	 
	public String getDpname() {
		return dpname;
	}
	public void setDpname(String dpname) {
		this.dpname = dpname;
	}
	 
	public void showInformation()
	{
		System.out.println("이름 : "+super.getName()+ " 연봉 : "+ super.getSalary()+ " 부서 : "+dpname);
	}
	 

}
