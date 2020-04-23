package com.gvp.excephandle;

public class BasicHandlers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int a = 5;
		int b = 0;
		
		try {
		  System.out.println("Need to handle exception place in try block ");
		  int c = a/b;
		}catch(ArrayIndexOutOfBoundsException Are){
			System.out.println("Needs to show the cause");
		}catch(NumberFormatException Ne){
			Ne.toString();
			System.out.println("Showing exception status name and reason clearly based on printStackTrace()");
		}catch(ArrayStoreException ae){
			System.out.println(ae.getMessage());
			System.out.println("Showing exception status reason clearly based on getMessage()");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Showing exception History like Name,Cause,line No,method,class clearly based on printStackTrace()");
		}finally {
			System.out.println("Compolsery Executes");
		}
		
		
		

	}

}
