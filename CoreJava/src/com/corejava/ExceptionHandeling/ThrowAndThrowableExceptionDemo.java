package com.corejava.ExceptionHandeling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ThrowAndThrowableExceptionDemo {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value i");
		int i =Integer.parseInt(br.readLine());
		
		System.out.println("Enter the value j");
		int j = Integer.parseInt(br.readLine());
		
		try {
		int k =i/j;
		
		if(k< 10) {
			throw new ArithmeticException();
		}
		}catch (ArithmeticException e) {
			System.out.println("result should be greater than 10");
		}finally {
			br.close();
		}
		
		
	}


}
