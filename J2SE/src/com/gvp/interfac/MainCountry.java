/**
 * 
 */
package com.gvp.interfac;

/**
 * @author GVNDPrasad
 *
 */
public class MainCountry {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("It's Country Bank");
		
		SBI sb = new SBI();
		System.out.println("Bank Name:"+sb.nameOfBank);
		
		sb.intRate();
		
		String loc = sb.hoq("Hyderabad");
		System.out.println("Bank HOF at \t"+loc);
		
		AndhraBank ab = new AndhraBank();
		System.out.println(ab.nameOfBank);
		System.out.println(ab.rate);
		
		
		String loc1 = ab.hoq("Vijayawada");
		System.out.println("Bank HOF at \t"+loc1);
	}

}
