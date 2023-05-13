package com.corejava.accessmodifier.defaults;

import com.corejava.accessmodifier.privateAccessMethod.PrivateAccessStudent;

public class Test {
	
	public static void main(String[] args) {
		//accessable in same package 
		
		Student st = new Student();
		
		st.info();
		
		PrivateAccessStudent pas = new PrivateAccessStudent();
		//not showing 
		
	}

}
