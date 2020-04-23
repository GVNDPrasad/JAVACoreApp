package com.gvp.interfac;

public class Hdfc implements WorldBank{

	Hdfc(){
		System.out.println("It is World Bank");
	}
	
	String nameOfBank = "Housing Development Finance Corporation ";
	double rate = 5;
	
	
	

	@Override
	public void intRate() {
		// TODO Auto-generated method stub
		System.out.println("Intrest is:"+rate);
		
	}

	@Override
	public String hoq(String name) {
		// TODO Auto-generated method stub
		return name;
	}

}
