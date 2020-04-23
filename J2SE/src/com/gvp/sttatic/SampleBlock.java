package com.gvp.sttatic;

class Check{
	
	static String name = "GVP";
	
	Check(){
		System.out.println("Default-Constructor calls at the time Object creation");
	}
	
	static {
	   name = "VND Prasad Grandhi";
	   System.out.println("Staic Block calls at the time of Class loading:"+name);
	}
}
public class SampleBlock extends Check{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Which method exectes first a) Static b) Default Constructor c) main()");
		Check c = new Check();
		
		System.out.println("Main method");
		
		
		
	}

}
