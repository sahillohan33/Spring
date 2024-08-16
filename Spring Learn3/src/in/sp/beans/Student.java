package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("deepak")
	private String name;
	@Value("103")
	private int rollno;
	@Value("78.9f")
	private float marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Roll Number : "+rollno);
		System.out.println("Marks : "+marks);
	}
	
	
}
