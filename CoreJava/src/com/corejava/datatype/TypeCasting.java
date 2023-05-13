package com.corejava.datatype;

public class TypeCasting {

	public static void main(String[] args) {

		// Assiging a value of one primitive datatype to another pri datatype

		// widening casting smaller type to larger type automatic

		int value = 1221332;

		long longValue = value;

		System.out.println(longValue);

		// char to int

		char alphabet = 'A';
		int a = alphabet;

		System.out.println(a);

		System.out.println(alphabet);

		int number = 123;
		double n = number;

		// char to string

		// Declaring a char variable
		char c = 'G';

		// Concatenating the char variable
		// with an empty string
		String s = "" + c;

		// 2nd method

		String stringAplhabet = Character.toString(c);

		// narrowing casting

		double pi = 3.146474;

		int piInt = (int) pi;
		float piFloat = (float) pi;

		System.out.println("double to float" + piFloat);

		// String to character
		String student = "rahul";

		char studnetChar = student.charAt(0);
		System.out.println("String to char" + studnetChar);

		// Int to byte

		int j = 102;

		byte jByte = (byte) j;
		System.out.println("Integer to Byte" + jByte);

	}

}