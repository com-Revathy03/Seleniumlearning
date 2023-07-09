package org.college;

public class Student extends Department{

	public void studentName() {
		System.out.println("Enter Student name");
	}
	
	public void studentDept() {
		System.out.println("Enter student department");
	}
	
	public void studentId() {
		System.out.println("Enter student Id");
	}
	
	public static void main(String[] args) {
		Student st = new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.departName();
		st.studentName();
		st.studentDept();
		st.studentId();
	}

}
