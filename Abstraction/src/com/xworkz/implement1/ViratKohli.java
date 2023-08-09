package com.xworkz.implement1;

import com.xworkz.abstraction.app.SmartWatch;

public class ViratKohli {
	private SmartWatch watch;
	 public ViratKohli(SmartWatch watch) {
		 this.watch=watch;
	 }
	 public void showTime() {
		 if (watch!=null) {
		 System.out.println("watch working, can hear music...");
		 this.watch.music();
	 }
	 else {
		 System.out.println("watch not working, cant hear music...");
	 }
	  }
}