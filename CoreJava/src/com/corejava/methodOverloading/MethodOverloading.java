package com.corejava.methodOverloading;

public class MethodOverloading {
	
	
	public static int sum(int x,int y) {
		return x+y;
	}
	
	public static double sum(double x,double y) {
		return x+y;
	}
	
	public static double sum(double x,double y,double z) {
		return x+y+z;
	}

	
	public static void main(String[] args) {
		
		
		System.out.println("sum method call with 2 parameter     \n");
		System.out.println(sum(10,20));
		
		System.out.println("double datatype sum method call with 2 parameter     \n");
		System.out.println(sum(10.7,20.7));
		
		System.out.println("sum method call with 3 parameter called     \n");
		System.out.println(sum(10.2,23.43,432.32));

		System.out.println("this is for git learning ignore it");
		
	}
}
