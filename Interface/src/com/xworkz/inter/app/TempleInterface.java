package com.xworkz.inter.app;

public class TempleInterface implements Temple {

	@Override
	public void getBlessing() {
		System.out.println("invoking the blessings of ganesh");
		
	}

	@Override
	public void getSilent() {
		System.out.println("invoking the silent in temple");
		
	}
}
