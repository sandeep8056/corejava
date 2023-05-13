package com.corejava.ExceptionHandeling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoException {
	
	public static void main(String[] args) {
		
		
		int num,divisor,result=0;
		
		int[] a = new int[4];
		
	
		
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			System.out.println("Enter number ");
			num=Integer.parseInt(br.readLine());
			System.out.println("Enter divisor");
			divisor = Integer.parseInt(br.readLine());
			
			
			result=num/divisor;
			
			for(int i =1;i<=5;i++) {
				a[i]=2;
			}
			
			for(int i :a) {
				System.out.println(i);
			}
			
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println(ai);
		}
		catch(ArithmeticException ae) {
			System.out.println("divisor value should not be zero");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Unknown Exception");
		}finally {
			
						
			System.out.println("result : "+result);
			

		}
		
		
			}

}
