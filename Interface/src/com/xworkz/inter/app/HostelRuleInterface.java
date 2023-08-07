package com.xworkz.inter.app;

public class  HostelRuleInterface implements HostelRule {
	
	@Override
	public void getEating() {
		System.out.println("invoking the eating");
		
	}

	@Override
	public void getWashing() {
		System.out.println("invoking the washing");
		
	}

}
