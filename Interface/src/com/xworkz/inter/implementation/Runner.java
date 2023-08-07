package com.xworkz.inter.implementation;

import com.xworkz.inter.app.AirportInterface;
import com.xworkz.inter.app.AirportRule;
import com.xworkz.inter.app.ArmyRule;
import com.xworkz.inter.app.ArmyRuleInterface;
import com.xworkz.inter.app.BankInterface;
import com.xworkz.inter.app.BankRule;
import com.xworkz.inter.app.Comapny;
import com.xworkz.inter.app.ComapnyRules;
import com.xworkz.inter.app.Hospital;
import com.xworkz.inter.app.HospitalRule;
import com.xworkz.inter.app.HostelRule;
import com.xworkz.inter.app.HostelRuleInterface;
import com.xworkz.inter.app.Husband;
import com.xworkz.inter.app.HusbandRules;
import com.xworkz.inter.app.Metro;
import com.xworkz.inter.app.MetroRule;
import com.xworkz.inter.app.Pub;
import com.xworkz.inter.app.PubRules;
import com.xworkz.inter.app.SaloonInterface;
import com.xworkz.inter.app.SaloonRule;
import com.xworkz.inter.app.Temple;
import com.xworkz.inter.app.TempleInterface;
import com.xworkz.inter.app.Vtu;
import com.xworkz.inter.app.VtuRule;
import com.xworkz.inter.app.Wife;
import com.xworkz.inter.app.WifeRules;


public class Runner {
	
		public static void main(String[] args) {
			ArmyRule army = new ArmyRuleInterface();
			army.getDiscipline();
			army.getUniforms();
			System.out.println("rules:"+army.everyone_should_talk);
		
		
			SaloonRule saloon = new SaloonInterface();
			saloon.getCutting();
			saloon.getDescent();
			System.out.println("rules:"+saloon.fees);
			
			HostelRule hostel = new HostelRuleInterface();
			hostel.getEating();
			hostel.getWashing();
			System.out.println("rules:"+hostel.cost);
			
			AirportRule airport = new AirportInterface ();
			airport.getPassport();
			airport.getTicket();
			System.out.println("rules:"+airport.price);
			
			Temple temple = new TempleInterface();
			temple.getBlessing();
			temple.getSilent();
			System.out.println("rules:"+temple.type);
		
			
			BankRule bank = new BankInterface();
			bank.getLoan();
			bank.getSafety();
			System.out.println("rules:"+bank.KeepingOrnaments);
			
			MetroRule metro = new Metro();
			metro.getTravel();
			metro.getSpeed();
			System.out.println("rules:"+metro.type);
			
			VtuRule vtu = new Vtu();
			vtu.getUsn();
			vtu.getPlacement();
			System.out.println("rules:"+vtu.Vtu_allow_through_cet);
			
			HospitalRule hospital = new Hospital();
			hospital.getCheckup();
			hospital.getSilent();
			System.out.println("rules:"+hospital.type);
			
			PubRules pub = new Pub();
			pub.getDance();
			pub.getDrinks();
			System.out.println("rules:"+pub.age);
			
			WifeRules wife = new Wife();
			wife.getCooking();
			wife.getOfficework();
			System.out.println("rules:"+wife.maintainingHome);
			
			ComapnyRules comapny = new Comapny();
			comapny.getId();
			comapny.getLaptop();
			System.out.println("rules:"+comapny.Proper_dress_up);
			
			HusbandRules husband = new Husband();
			husband.getThings();
			husband.getSafety();
			System.out.println("rules:"+husband.Maintaining_the_house);
					
		}	
	}

