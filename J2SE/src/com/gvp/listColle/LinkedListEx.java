package com.gvp.listColle;


import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	
	static {
		System.err.println("List follows Allowing Duplicates & Same order");
	}
	
	void remained() {
		System.out.println("Linked List program with generics \n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListEx l = new LinkedListEx();
		l.remained();
		
		List<String> ll = new LinkedList<>();//Does not put datatype condition
		ll.add("Prasad");//String
		ll.add("Naga");//int
		ll.add("Durga");//String
		ll.add("Prasad");//double
		ll.add("Venkata");//boolean
		
		System.out.println("Array List:"+ll);
		
		for(Object o : ll) {
			System.out.println("\t"+o+"\n");
		}
		
		System.out.println("Remove 3 value is "+ll.isEmpty());

	}

}
