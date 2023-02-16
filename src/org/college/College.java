package org.college;

public class College extends Student{
	
	private void collegeName() {
	
		System.out.println("College_Name:AnnaUniversity");

	}
	
	private void collegeCode() {
		System.out.println("College_Code:4217");
	}

	
	public static void main(String[] args) {
		
		College a = new College();
		a.collegeName();
		a.collegeCode();
		a.studentName();
		a.studentDept();
		a.studentId();
		a.deptName();
		a.hostelName();
		
	}
}


