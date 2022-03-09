package com.revature.exception.assignment3;

public class ExceptionsSample {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try {
			System.out.println("Starting try block");
		int result = a/b;
		System.out.println("Ending try block");
		}catch(ArithmeticException e) {
			System.out.println("Starting catch block");
			e.printStackTrace();
			System.out.println("Cannot "+ e.getMessage());
		}

	}

}
