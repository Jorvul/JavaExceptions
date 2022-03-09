package com.revature.exception.assignments;

public class Score {
 private int score;

public Score(int score) {
	super();
	this.score = score;
}


public int getScore() {
	return score;
}

public void setScore(int score) {
	this.score = score;
}
 
 public void highScore() throws InvalidScoreException{
	 if(this.score < 200) {
		 throw new InvalidScoreException();
	 } else {
		 System.out.println("You have passed your exam!");
	 }
 }
}
