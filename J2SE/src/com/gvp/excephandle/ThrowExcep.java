package com.gvp.excephandle;

public class ThrowExcep {
	
	static void me() {
		
		try {
			System.out.println("User understandable message");
			throw new ArrayIndexOutOfBoundsException("Its array exception");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   me();

	}

}
