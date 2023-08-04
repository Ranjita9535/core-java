package com.xworkz.chicken;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("invoking main in Runner");
	    Chicken chicken= new Chicken (400,"HSR");
		chicken.printInfo();
		
		FarmChicken formchicken = new FarmChicken (400,"HSR",4,"ChickenFormer");
		formchicken.printInfo();
		
		BroilerChicken broilerchicken= new BroilerChicken (400,"HSR",4,"ChickenFormer",false,1.2f);
		broilerchicken.printInfo();
	}

}
