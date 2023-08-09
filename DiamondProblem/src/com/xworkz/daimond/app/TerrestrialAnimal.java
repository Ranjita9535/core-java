package com.xworkz.daimond.app;

public interface TerrestrialAnimal extends Animal {
	
	default public void livesIn() {
		System.out.println("lives on land");
}
}