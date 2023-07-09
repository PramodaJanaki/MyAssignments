package week3.homeassignment;

public class Student extends Department {
	public void studentName() {
		System.out.println("The student name is Pramoda");
		
	}
	public void studentDept() {
		System.out.println("The student department is CSE");
		
	}
	public void studentId() {
		System.out.println("The student id is 14P31A0501");
		
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.collegeName();
		s.collegeCode();
		s.CollegeRank();
		s.deptName();
		s.studentDept();
		s.studentId();
		s.studentName();
	}
}
