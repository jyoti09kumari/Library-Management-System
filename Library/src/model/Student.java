package model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Student {
	private int roll;
	private String name; 
	private String branch;
	private String password;
	public int numBooks = 0;
	private Date dob;
	private String email ;
	private List<Issue> issues = new ArrayList<>(); //contorl+shift+ O
	
	public Student(int roll, String name, String branch, String password, Date dob, String email) {
		super();
		this.roll = roll;
		this.name = name;
		this.branch = branch;
		this.password = password;
		this.dob = dob;
		this.email = email;
	}
	public int getNumBooks() {
		return numBooks;
	}
	public void setNumBooks(int numBooks) {
		this.numBooks = numBooks;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Issue> getIssues() {
		return issues;
	}
	public void setIssues(List<Issue> issues) {
		this.issues = issues;
	}
	// java.sql.Date : Date    java.util.Date : Date and time 
	// LocalDate java 8 
	
	public Student(int roll, String name, String branch, String password) {
		super();
		this.roll = roll;
		this.name = name;
		this.branch = branch;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", branch=" + branch + ", password=" + password
				+ ", numBooks=" + numBooks + ", dob=" + dob + ", email=" + email + ", issues=" + issues + "]";
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
