package com.training.java8;

import java.util.function.Predicate;

public class LamdaDemo {

	public static void main(String[] args) {
//		int result = sum(23,45);
//		System.out.print(result);;
		
//		MyFuncInterface obj = (x, y) -> x + y;
//		System.out.print(obj.sum(21, 19));

		// 2. Use a lambda expression 
	    // MyFuncInterface obj = (x, y) -> x * y;
	     // 3. Call the multiply method and print the result
	     //System.out.print(obj.multiply(21, 19));  
		
		// Concatenates strings
		MyFuncInterface obj = (x, y) -> x + y; 
        // 3. Call the concatenate method and print the result
        System.out.print(obj.concatenate("Hello", "World!"));  
        
        Predicate<Integer> val = a -> a%2 == 0;
        System.out.print(val.test(34));
        
    }
	
	}
	
//	private static int sum(int a, int b) {
//		return a+b;
//	}




