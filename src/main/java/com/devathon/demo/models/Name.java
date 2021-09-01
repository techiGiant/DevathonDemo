package com.devathon.demo.models;

public class Name {
	
	private String displayName;
	private String firstName;
	private String lastName;
	private String middleName;
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
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
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public Name(String displayName, String firstName, String lastName, String middleName) {
		super();
		this.displayName = displayName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}
	@Override
	public String toString() {
		return "Name [displayName=" + displayName + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", middleName=" + middleName + "]";
	}

}
