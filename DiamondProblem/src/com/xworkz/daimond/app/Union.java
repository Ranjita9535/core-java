package com.xworkz.daimond.app;

public class Union implements RBI,SBI,Axis{
	
	@Override
	public void message() {
	SBI.super.message();
	Axis.super.message();

}
}