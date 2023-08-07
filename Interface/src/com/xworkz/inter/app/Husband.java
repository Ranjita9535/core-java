package com.xworkz.inter.app;

public class Husband implements HusbandRules {
	
	@Override
	public void getThings() {
		System.out.println("invoking the Things");
		
	}

	@Override
	public void getSafety() {
		System.out.println("invoking the safety");
		
	}

}
