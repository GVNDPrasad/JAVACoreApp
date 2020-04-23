package com.gvp.interfac;

public class MainWorld {
	
	public static void main(String[] args) {
		
		System.out.println("It's World Bank");
		
		Hdfc hd = new Hdfc();
		
		System.out.println("Bank Name:"+hd.nameOfBank);
		
		hd.intRate();
		
		String loc = hd.hoq("US");
		
		System.out.println("Bank HOF at \t"+loc);
		
		
	}

}

