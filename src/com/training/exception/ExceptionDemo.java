package com.training.exception;

import java.util.InputMismatchException;

public class ExceptionDemo {

	 public static void main(String[] args) throws InputMismatchException {//ether handle it or throw it 
		 int i = 5;
		 int j = 0;
		 int age = 16;
		 int result = 0;
		 try {
			
			 Integer k = new Integer("123");
			 if(age < 18) {
				 throw new MinimumAgeException("Age should not be less than 18"); //will jump to NumberFormatException()
			 }
			 
			 result = i/j;
		 }
		 // will return first on..
		 catch(ArithmeticException| MinimumAgeException  | NumberFormatException e) {
			 if (e instanceof ArithmeticException){
				 System.out.println("Age should not be less than 18");
			 }
			 else if (e instanceof MinimumAgeException){
				 System.out.println(e.getMessage());
			 }
			 
			 else if(e instanceof NumberFormatException){
				 System.out.println("Number Format Exception occurred!!");			
				 }
		
	
		 }
		 
	//	 catch(NumberFormatException e) {
	//		 System.out.println("Number Format Exception occurred!");
	//	 }
		 finally {
			 System.out.println("Inside finally block");
		 }
		// catch(Exception e) {
		//	 System.out.println("An Exception occurred!");
		// }
		 System.out.println("Exception resumes::" + result);
	 }
}
