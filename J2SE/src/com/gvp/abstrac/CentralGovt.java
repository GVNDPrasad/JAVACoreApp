package com.gvp.abstrac;

abstract class CentralGovt {

	private String nameOfGovt;
	
	int centBudget;
	
	//Note: Abstract method has only methods. Don't have variables
	
	abstract void stateGovtName();
	
	abstract String lockDownStatus(String status);//Abstract Method
	
	int centralBudget(int centBudget) {
		return centBudget;
	}//Non-Abstract Method

	
	public String getNameOfGovt() {
		return nameOfGovt;
	}

	public void setNameOfGovt(String nameOfGovt) {
		this.nameOfGovt = nameOfGovt;
	}
	
	
	

}
