package com.xworkz.implementation;

import com.xworkz.abstraction.app.SmartWatch;

public class FireBoltt implements SmartWatch {
	
	@Override
	public boolean music() {
		System.out.println("invoking music");
		return true;
	}
}
