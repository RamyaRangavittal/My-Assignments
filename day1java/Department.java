package week3.day1java;

public class Department extends Students {

	public void getStudentInfo(String email,int ph) {
		super.getStudentInfo(email, ph);
		System.out.println("child class"+email + ph);
		
	}}
