package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.Elevator;
import com.xworkz.abstraction.app.Kidney;
import com.xworkz.abstraction.app.Laptop;
import com.xworkz.abstraction.app.PrintingMachine;
import com.xworkz.abstraction.app.SmartWatch;
import com.xworkz.abstraction.app.WashingMachine;
import com.xworkz.abstraction.app.WaterPurifier;
import com.xworkz.implement1.ArjunKapoor;
import com.xworkz.implement1.HemaMalini;
import com.xworkz.implement1.Omkar;
import com.xworkz.implement1.Priya;
import com.xworkz.implement1.Rahul;
import com.xworkz.implement1.Ranjita;
import com.xworkz.implement1.ViratKohli;
import com.xworkz.implementation.FireBoltt;
import com.xworkz.implementation.HpLaptop;
import com.xworkz.implementation.HumanKidney;
import com.xworkz.implementation.KentWaterPurifier;
import com.xworkz.implementation.LG;
import com.xworkz.implementation.Omega;
import com.xworkz.implementation.Samsung;

public class Runner {
		public static void main(String [] args) {
		WaterPurifier purifier = new KentWaterPurifier ();
		HemaMalini hemamalini= new HemaMalini(purifier);
		purifier.filter();
		System.out.println("invoking filter");
		
		Laptop laptop = new HpLaptop ();
		Rahul rahul = new Rahul(laptop);
		laptop.display();
		System.out.println("invoking Display");
		
	    PrintingMachine machine = new LG();
	    Ranjita ranjita = new Ranjita(machine);
		machine.print();
		System.out.println("invoking Print");
		
		Elevator elevator = new Omega();
		Priya priya = new Priya(elevator);
		elevator.carryLuggage();
		System.out.println("invoking CarryLuggage");
		
		
		SmartWatch watch=new FireBoltt();
		ViratKohli kohli = new ViratKohli(watch);
		watch.music();
		System.out.println("invoking showtime");
		
		Kidney kidney = new HumanKidney();
		Omkar omkar = new Omkar(kidney);
		kidney.Clean();
		System.out.println("invoking clean");
		
		WashingMachine machine1 = new Samsung();
		ArjunKapoor ak = new ArjunKapoor(machine1);
		machine1.wash();
		System.out.println("invoking washing");
		
	}
}




 