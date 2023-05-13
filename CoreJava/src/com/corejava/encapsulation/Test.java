package com.corejava.encapsulation;

public class Test {
	
	public static void main(String[] args) {
		
		
		Person person = new Person();
		
		person.setName("Raghav");
		person.setAge( 22);
		person.setLocation("chembur");
		
		
		System.out.println(person.getName() +"\n"+person.getAge()+" \n "+person.getLocation());
		
		
	}

}
