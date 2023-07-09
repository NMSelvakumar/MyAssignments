package org.student;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Student ID: " + id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID: " + id + " and Student Name: " + name);
	}
	
	public void getStudentInfo(String email, String phoneNumber) {
		System.out.println("Student Email: " + email + " and Phone Number: "+ phoneNumber);
	}

	public static void main(String[] args) {
		Students std = new Students();
		std.getStudentInfo(10145);
		std.getStudentInfo(10145, "Selva");
		std.getStudentInfo("selva@gmail.com", "9876543210");
	}
	
}
