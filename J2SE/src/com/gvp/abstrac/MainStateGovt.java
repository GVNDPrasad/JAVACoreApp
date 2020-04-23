package com.gvp.abstrac;

public class MainStateGovt {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		AndraGovt ag = new AndraGovt();
		ag.stateGovtName();
		String statusOfAPGovt = ag.lockDownStatus("ActiveHigh");
		System.out.println(statusOfAPGovt);
		
	}

}
