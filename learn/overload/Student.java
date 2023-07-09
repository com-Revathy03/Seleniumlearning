package learn.overload;

public class Student {
	public void getStudentInfo(int id) {
		System.out.println("student id is: "+id);
	}
	
	public void getStudentInfo(int id,String name) {
		System.out.println("Student Id is : " + id+" and Name is: " + name);
	}
	
	public void getStudentInfo(String email, long phonenumber) {
		System.out.println("Student Email is: " +email +" and phonenumber is: "+ phonenumber);
	}

	public static void main(String[] args) {
		Student stud = new Student();
		stud.getStudentInfo(230);
		stud.getStudentInfo(230, "Revathy");
		stud.getStudentInfo("revathy31@gmail.com", 9361221212l);		
	}
}
