package com.xworkz.daimond.app;

public class Customer implements SBI,Axis{
	public void message(){
	
		SBI.super.message();
		Axis.super.message();
	}
}
