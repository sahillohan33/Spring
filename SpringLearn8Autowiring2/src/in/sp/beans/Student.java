package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int rollno;
	private String name;
	@Autowired
	private Address address;
	@Autowired
	private Subject subject;
	/*
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	*/
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	*/
	public void display() {
		System.out.println("Roll Number : "+rollno);
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("Subject : "+subject);
	}
	
}
