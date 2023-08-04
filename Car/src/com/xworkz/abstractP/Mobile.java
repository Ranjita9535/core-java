package com.xworkz.abstractP;

	public  abstract class Mobile {
		public abstract void processor();
		public abstract String getBrandName();
		public final int getPrice() {
			return 0;
		}
}