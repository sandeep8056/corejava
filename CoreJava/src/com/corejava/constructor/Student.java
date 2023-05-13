package com.corejava.constructor;

public class Student {
	
	String name;
	int id;
	
	//default constructor
	Student(){
		//initilizing the literal value
		
		this.id=1;
		this.name ="Abhijeet";
		
		System.out.println("Defalut constructor is invoked");
	
	}
	
	
	Student(String name ,int id){
		
		System.out.println("Parameterized constructor is invoked");

		this.name=name;
		this.id = id;
	}
	
	Student(Student student){
		System.out.println("Copy constructor is invoked");

		this.name = student.name;
		this.id =student.id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	
		
		
			
	

}
