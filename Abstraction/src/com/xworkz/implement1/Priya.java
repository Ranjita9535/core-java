package com.xworkz.implement1;

import com.xworkz.abstraction.app.Elevator;

public class Priya {
	
	private Elevator elevator;
	 public Priya(Elevator elevator) {
		 this.elevator=elevator;
	 }
	 public void  getcarryLuggage() {
		 
		 if (elevator!=null) {
		 System.out.println("elevator working, can carry luggage...");
		 this.elevator.carryLuggage();
	 }
	 else {
		 System.err.println("elevator not working,can't carry luggage...");
}
}

}
