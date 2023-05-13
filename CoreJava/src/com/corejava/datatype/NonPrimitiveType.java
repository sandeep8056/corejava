package com.corejava.datatype;


public class NonPrimitiveType {
	
	public static void main(String[] args) {
		
		//reference type  refer an object
		
		String[] car = {"Tata","Honda","Maruti","BMW"};   //here we refering array type to store
		 	
		//accessing element
		
		System.out.println(car[0]);
	
		car[0]="farari";
		
		System.out.println(car[0]); // car at 0th place farari

		
		String name ="Sandeep";
		
		System.out.println(  name.charAt(0));
		
	}

}
