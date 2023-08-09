package com.xworkz.implement1;

import com.xworkz.abstraction.app.Kidney;

public class Omkar {

	private Kidney kidney;
	public Omkar (Kidney kidney) {
		this.kidney=kidney ;
	}
	public void clean() {
	
	if (kidney!=null) {
		 System.out.println("kidney is working, can clean...");
		 this.kidney.Clean();
	 }
	 else {
		 System.out.println("kidney not working,can't clean...");
	 }
	}
}
