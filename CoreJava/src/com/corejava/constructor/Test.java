package com.corejava.constructor;

public class Test {
	
	public static void main(String[] args) {
		
		
		Student student1 = new Student();
		
		System.out.println(" Stduent 1 : id : "+student1.getId()+" name : "+student1.getName());
		
		//parameterized constructor is called
		Student student2 = new Student("mahesh",2);
		
		System.out.println( "Stduent 2 : id : "+student2.getId()+" name : "+student2.getName());
		
		//copy constuctor calleed
		Student student3 = new Student(student2);
		
		System.out.println("Stduent 2 : id : "+student3.getId()+" name : "+student3.getName());
		
		
				
		
		
		
	}

}
