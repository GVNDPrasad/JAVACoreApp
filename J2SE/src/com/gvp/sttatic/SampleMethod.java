package com.gvp.sttatic;

class Sample{
	
	Sample(){
		System.err.println("Static Method Program");
	}//Default constructor call at the time of object creation
	
	public void check() {
		System.out.println("Non-Static Metod (Needs to create object)");
	}
	
	static void test() {
		System.out.println("Static Metod (Needs to call by a class name)");
	}
}


public class SampleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample s = new Sample();// S is Reference Variable & Object is new Sample()
		s.check();//Calling Non-Static Method with Reference variable
		
		Sample.test();//Calling Static Method with Class Name

	}

}
