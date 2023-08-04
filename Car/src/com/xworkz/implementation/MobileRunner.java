package com.xworkz.implementation;

import com.xworkz.abstractP.Keypad;

public class MobileRunner {

		public static void main(String[] args) {
			Keypad keypad = new Keypad();
			keypad.processor();
			keypad.getBrandName();
		}
}
