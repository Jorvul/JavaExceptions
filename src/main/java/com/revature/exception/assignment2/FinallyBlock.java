package com.revature.exception.assignment2;

public class FinallyBlock {

	public static void main(String[] args) {
		int arr[] = new int[3];
		
		try {
			System.exit(0);
			arr[1] = 2;
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Goodbye friends!");
		}

	}

}
