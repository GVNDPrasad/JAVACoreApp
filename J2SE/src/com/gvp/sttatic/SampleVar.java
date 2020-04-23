package com.gvp.sttatic;

class Emp{
	 
	//Instance or Global variables
	int empNo;
	String empName;
	
	
	//Static variables
	static String compName = "GVP Technologies";
	
	void display() {
		System.out.println("Employee Details are:"+empNo+"\t"+empName+"\t"+compName+"\n");
	}
	
}
public class SampleVar {
     
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.err.println("Static variables Program");
		
		//Emp class object creation
		Emp venkat = new Emp();//venkat is Reference variable
		venkat.empNo = 846663;
		venkat.empName = "Venkat";
		venkat.display();
		
		Emp naga = new Emp();
		naga.empNo = 846664;
		naga.empName = "NAGA";
		naga.display();
		
		Emp durga = new Emp();
		durga.empNo = 846665;
		durga.empName = "DURGA";
		durga.display();
		
		

	}

}
