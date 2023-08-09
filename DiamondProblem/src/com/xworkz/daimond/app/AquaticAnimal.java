package com.xworkz.daimond.app;

public interface AquaticAnimal extends Animal {
	
	default public void livesIn() {
		System.out.println("lives on water");
	}	
}
