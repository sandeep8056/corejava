package com.corejava.AbstractClassAndMethod;

public class HondaCity extends Bike{

	@Override
	void run() {
		System.out.println("luxuary feel and running safely");
		
	}
	
	
	public static void main(String[] args) {
		
		Bike b = new HondaCity();
		b.bikeInfo();
		b.run();
		
	}

}
