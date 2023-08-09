package com.xworkz.implementation;

import com.xworkz.abstraction.app.Kidney;

public class HumanKidney implements Kidney {

	@Override
	public boolean Clean() {
		System.out.println("invoking the HumanKidney");
		return true;
	}
}



