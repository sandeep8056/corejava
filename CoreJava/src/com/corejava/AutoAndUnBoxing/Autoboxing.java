package com.corejava.AutoAndUnBoxing;

public class Autoboxing {
	
	public static void main(String[] args) {
		
		//autoboxing
		int a =100;
		
		Integer avalue = a; //autoboxing 
		
		//explicit
		Integer i = Integer.valueOf(a); 
		
		double pi = 3.125;
		Double piValue = pi; //automatically compilier can write Double.valueOf(score)
		
		//explicitly
		Double piExplicitly=Double.valueOf(pi);
		
		String s = "s";
		
		int stringVal = Integer.parseInt(s);
		char c = s.charAt(0);
		
		String ca = Character.toString(c);
		
		
		
		
		//unboxing obj to primitive
		
		Integer score = 100;
		
		int scoreInInt = score;  //unboxing auto maticaly
		
		int scoreInIntExplicitly =score.intValue();
		
		
		
		
		
		
	}

}
