package com.corejava.ExceptionHandeling.UserDefineException;

import java.util.Scanner;




public class TestException {
	
	
	
	public static void main(String[] args){
		 int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age to check wheather you are eligible or not");
		 age = sc.nextInt();
		 
		 
		 try {
		 vote(age);
		 }catch(InvalidAgeException e) {
			 	System.out.println(e);
		 }
		 
		 
		
		 			
		
	}
	
	public static void vote(int age) throws  InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("Not Eligible for vote");
		}else {
			System.out.println("Eligible for vote");
		}

	}

}
