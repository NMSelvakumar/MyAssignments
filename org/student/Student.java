package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Student Name Function --> Student");
	}
	
	public void studentDept() {
		System.out.println("Student Department Function --> Student");
	}
	
	public void studentId() {
		System.out.println("Student ID Function --> Student");
	}
	
	public static void main(String[] args) {
		
		Student std = new Student();		
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		
		std.deptName();
		
		std.studentName();
		std.studentDept();
		std.studentId();
	}
}
