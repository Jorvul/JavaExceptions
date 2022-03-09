package com.revature.exceptions.custom;

public class PersonManager {

	public static void main(String[] args) {
		Person p = new Person("Jorge", 15);
		
		try {
			p.castVote();
		} catch (InvalidAge e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
