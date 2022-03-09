package com.revature.exceptions;

public class FirstException {
 public static void main(String[] args) {
	int x = 20;
	int y = 0;
	int result =0;
	int[] nums = {1, 2, 3, 4, 5};
	try {
		System.out.println("Before exception..");
	 result = x/y;
	 //this line doesn't get executed
	 System.out.println("After the exception...");
	} catch(ArithmeticException e) {
		System.out.println("Catching the exception");
		System.out.println("Cannot " + e.getMessage());
		e.printStackTrace();
	} 
	
	try {
	nums[6] = 20;
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array " + e.getMessage());
	}
	try {
		Class.forName("someClass");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	System.out.println("Result = " + result);
}
}
