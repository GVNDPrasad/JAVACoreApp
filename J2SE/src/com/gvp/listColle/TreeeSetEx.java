package com.gvp.listColle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeeSetEx {
	
	static {
		System.err.println("Set follows Not-allowing Duplicates & Random order");
	}
	
	static void remained() {
		System.out.println("Tree Set program without generics \n");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remained();
		
		Set ts = new TreeSet();//Does not put datatype condition
		ts.add("Prasad");//String
		ts.add("BAT");//int
		ts.add("Prasad");//String
		ts.add("HAT");//double
		ts.add("RAT");//boolean
		
		System.out.println("Tree List:"+ts);
		
		for(Object l : ts) {
			System.out.println("\t"+l+"\n");
		}
		
		System.out.println("Size is "+ts.size());

	}

}
