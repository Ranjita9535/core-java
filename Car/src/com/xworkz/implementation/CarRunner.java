package com.xworkz.implementation;


import com.xworkz.abstractP.WirlessConnections;

public class CarRunner {
	
	public static void main(String [] args) {
		
		WirlessConnections wirlessConnections = new WirlessConnections();
		wirlessConnections.budget();
		wirlessConnections.getExpectedTime();
		
	}
}
