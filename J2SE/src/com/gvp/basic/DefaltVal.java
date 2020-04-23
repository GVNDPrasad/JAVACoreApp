package com.gvp.basic;

public class DefaltVal {
	int sno;
	String sname;
	float age;
	String sfname;
	char gender;
	boolean fessPaid;
	double amt;
	static String schoolName;
	String princeName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Default values of Instance variables");
		
		DefaltVal dv = new DefaltVal();
		System.out.println("Student No:"+dv.sno);
		System.out.println("Student Name:"+dv.sname);
		System.out.println("Student age:"+dv.age);
		System.out.println("Student Father:"+dv.sfname);
		System.out.println("Student gender:"+dv.sno);
		System.out.println("Student amount:"+dv.amt);
		System.out.println("Student Fee status:"+dv.fessPaid);
		System.out.println("Student Fee status:"+dv.princeName);
		
		System.out.println("Student Fee status:"+DefaltVal.schoolName);
		
		System.out.println("JVM initilise all default values for variables at the time of not Initilised");

	}

}
