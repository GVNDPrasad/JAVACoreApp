package com.gvp.listColle;

import java.util.HashSet;
import java.util.Set;

public class HashhSetEx {
	
	static {
		System.err.println("Set follows Not-allowing Duplicates & Random order");
	}
	
	static void remained() {
		System.out.println("Hash Set program with generics \n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashhSetEx h = new HashhSetEx();
		h.remained();
		
		Set<String> hs = new HashSet<>();
		hs.add("Prasad");//String
		hs.add("BAT");//int
		hs.add("Prasad");//String
		hs.add("HAT");//double
		hs.add("RAT");//boolean
		
		System.out.println("Hash Set:"+hs);
		
		for(Object l : hs) {
			System.out.println("\t"+l+"\n");
		}
		
		hs.clear();
	}

}
