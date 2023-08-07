package com.xworkz.inter.app;

public class AirportInterface  implements AirportRule{
	
	@Override
	public void getPassport() {
		System.out.println("invoking the Passport");
		
	}
	@Override
	public void getTicket() {
		System.out.println("invoking the Ticket");
		
	}

}







