package com.gvp.excephandle;

public class ListOfExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String s = null; System.out.println("NullPointerException:"+s.length());
		 */

		/*
		 * int i = 2/0; 
		 * System.out.println("Arithmetic Exception:"+i);
		 */
		
		/*
		 * int n = Integer.parseInt("GVP");
		 * System.out.println("NumberFormatException:"+n);
		 */
		
		String s[] = new String[5];
		s[6] = "GSR";
		System.out.println("ArrayIndexOutOfBoundsException:"+s);
		

	}

}
