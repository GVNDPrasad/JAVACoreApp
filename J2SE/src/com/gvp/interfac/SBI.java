package com.gvp.interfac;

public class SBI implements CountryBank {
	
	SBI(){
		System.out.println("It is Country Bank");
	}
	
	
	String nameOfBank = "State Bank of India";
	double rate = 4;
	String parentBank = "RBI";
	private Facilities[] values;
	

	@Override
	public void intRate() {
		// TODO Auto-generated method stub
		System.out.println("Intrest is:"+rate);
		values = Facilities.values();
		for (Facilities facilities : values) {
			System.out.println("Facilities List:"+facilities);
		}
	}

	@Override
	public String hoq(String name) {
		// TODO Auto-generated method stub
		
		return name;
	}

	

}
