package com.gvp.construc;

import java.util.Scanner;

class Student{
	
	int sno;
	String sname;
	int age;
	String sfname;
	char gender;
	boolean fessPaid;
	static String schoolName;
	String princeName;
	
	//Default Constructor
	Student(){
		System.out.println("Default Constructor");
	}
	
	//Parameterized constructor with this Keyword
	Student(int sno,String sname){
		this.sno = sno;
		this.sname = sname;
	}
	
	//Parameterized constructor without this Keyword
	Student(String fname,boolean feesStatus,char gender){
		sfname = fname;
		fessPaid = feesStatus;
		this.gender = gender;
	}
	
}
public class SampleDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Constructor Program");
		
		Student.schoolName = "GVP Schools";//Static
		System.out.println("School Name:"+Student.schoolName);
		
		Student s = new Student();//Calling Default constructor
		
		s.princeName = "Grandhi VND Prasad";//Non-Static
		System.out.println("Principal Name:"+s.princeName);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student ID");
		int sno = sc.nextInt();
		
		System.out.println("Enter Student Name");
		String sname = sc.next();
		
		Student s1 = new Student(sno,sname);//Calling Parameterized constructor dynamic way
		
        System.out.println("Student ID:"+s1.sno+"\n Student Name:"+s1.sname);
        
        Student s3 = new Student("GSR",true,'M');//Calling Parameterized constructor manual way
        System.out.println("Other Details:"+s3.sfname+"\t"+s3.fessPaid+"\t"+s3.gender);
	}

}
