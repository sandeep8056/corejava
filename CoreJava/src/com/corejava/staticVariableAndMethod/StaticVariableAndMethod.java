package com.corejava.staticVariableAndMethod;

public class StaticVariableAndMethod {
	
	static int score=102;
	
	
	
	static {
		System.out.println("static block");
	}

	{
		System.out.println("instance block");
		}
	
	
	public static void call() {
		System.out.println("static methpod is called");
	}
	
	public StaticVariableAndMethod(){
		System.out.println("constructor");
	}
	
	
	public static void main(String[]args) {
		
		StaticVariableAndMethod staticVariableAndMethod = new StaticVariableAndMethod();
		
		StaticVariableAndMethod staticVariableAndMethod1 = new StaticVariableAndMethod();
	}
	}
