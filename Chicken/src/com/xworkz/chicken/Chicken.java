// Polymorphisum

package com.xworkz.chicken;

public class Chicken {

	int price;
	String location;
	
	public Chicken(int price,String location) {
		super();
		this.price=price;
		this.location= location;
		System.out.println("invoking int,String in Chicken");
	}
	
	void printInfo() {
	System.out.println("invoking printinfo in Chicken");
	System.out.println(this.price);
	System.out.println(this.location);
	}
}
