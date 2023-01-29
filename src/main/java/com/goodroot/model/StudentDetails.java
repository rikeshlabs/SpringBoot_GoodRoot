package com.goodroot.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "student")
public class StudentDetails {

	@Id
	int id;

	String FirstName;
	String LastName;
	String emailId;
	String password;

	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDetails(int id, String firstName, String lastName, String emailId, String password) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.emailId = emailId;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
