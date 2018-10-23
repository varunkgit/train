package com.techm.devopp.entity;

import org.springframework.stereotype.Component;

@Component
public class Associate {

	private int id;
	private String firstName = "varun";
	private String lastName;
	
	
	public Associate() {
		
	}

	public Associate(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Associate [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	
}
