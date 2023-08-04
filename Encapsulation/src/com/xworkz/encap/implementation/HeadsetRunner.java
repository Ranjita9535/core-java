package com.xworkz.encap.implementation;

import com.xworkz.enap.app.Headset;

public class HeadsetRunner {
		
			public static void main(String[] args) {
				Headset headset = new Headset();
				System.out.println(headset);
				headset.setPrice(300);
				headset.setBrand("oneplus");
				headset.setColor("red");
				headset.setIsWireless(true);
				headset.setVolume(10);
				
				System.out.println(headset);
				
				}

		}
			

	
