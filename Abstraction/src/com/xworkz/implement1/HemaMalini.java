package com.xworkz.implement1;

import com.xworkz.abstraction.app.WaterPurifier;

public class HemaMalini {

private WaterPurifier purifier;
	
	public HemaMalini(WaterPurifier purifier) {
		this.purifier=purifier;
	}
	
	public void PurifyWater() {
		if(purifier!= null) {
			System.out.println("Purifier working, can purify...");
			this.purifier.filter();
		}
		else {
			System.err.println("Purifier not working, cannot be purify...");
		}
	}	
}
