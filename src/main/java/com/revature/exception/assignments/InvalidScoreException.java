package com.revature.exception.assignments;

public class InvalidScoreException extends Exception {

	@Override
	public String getMessage() {
		
		return "You have failed your exam";
	}
	

	
}
