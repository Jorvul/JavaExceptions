package com.revature.exception.assignments;



public class FinalScore {

	public static void main(String[] args) {
	
		Score p = new Score(200);
		
		try {
			p.highScore();
		} catch(InvalidScoreException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
