package com.corejava.accessmodifier.privateAccessMethod;

public class PrivateAccessStudent {
	
	private void info() {
		System.out.println("private access modifier");
	}

//not accessable info method out of this  class
	public static void main(String[] args) {
		PrivateAccessStudent pas = new PrivateAccessStudent();
		pas.info();
	}

}


