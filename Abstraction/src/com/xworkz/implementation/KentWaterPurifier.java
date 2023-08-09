package com.xworkz.implementation;

import com.xworkz.abstraction.app.WaterPurifier;

public class KentWaterPurifier implements WaterPurifier {

	@Override
	public boolean filter() {
		System.out.println("invoking the kentWaterPurifier");		
		return true;
	}
}
