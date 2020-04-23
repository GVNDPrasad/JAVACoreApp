package com.gvp.listColle;

import java.util.ArrayList;
import java.util.List;

public class ArraListEx {
	
	static {
		System.err.println("List follows Allowing Duplicates & Same order");
	}
	
	static void remained() {
		System.out.println("Array List program without generics \n");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remained();
		
		List al = new ArrayList();//Does not put datatype condition
		al.add("Prasad");//String
		al.add(28);//int
		al.add("Prasad");//String
		al.add(3.65);//double
		al.add(true);//boolean
		
		System.out.println("Array List:"+al);
		
		for(Object l : al) {
			System.out.println("\t"+l+"\n");
		}
		
		System.out.println("Index 4 value is "+al.get(4));
		

	}

}
