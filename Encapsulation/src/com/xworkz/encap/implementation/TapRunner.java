package com.xworkz.encap.implementation;

import com.xworkz.enap.app.Tap;

public class TapRunner {
	
		
		public static void main(String [] args) {
			Tap tap = new Tap ();
			System.out.println(tap);
			
			tap.setPrice(300);
			tap.setLength("6m");
			tap.setType("Bib Tap");
			tap.setColor("Silver");
			tap.setMadeOf("Brace");
			
			System.out.println(tap);
			
			}
	}





