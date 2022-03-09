package com.revature.exceptions.custom;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void castVote() throws InvalidAge{
		if(this.age < 18) {
			throw new InvalidAge();
		} else {
			System.out.println("You can vote");
		}
	}
	
}
