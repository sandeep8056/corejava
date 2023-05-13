package com.corejava.methodOverriding;


class Physics{
	
	public void say() {
		System.out.println("this is physics class");
	}
		
}

class Math extends Physics{
	
	@Override
	public void say() {
		System.out.println("this is Math class");

	}
}















public class MethodOverloading {

	public static void main(String[] args) {
		
		Math m = new Math();
		m.say();
		
		Physics p = new Physics();
		p.say();
		
	}
		
}


