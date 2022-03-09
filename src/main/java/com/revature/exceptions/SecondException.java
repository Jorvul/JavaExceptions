package com.revature.exceptions;

public class SecondException {

	public static void main(String[] args) {
		int num[] = {1, 2,3,4,5};
		try {
		num[6] = 20;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Thi is finally block");
		}
	}
}
