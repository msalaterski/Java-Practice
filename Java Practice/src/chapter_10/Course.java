package chapter_10;

public class Course {
	String courseName;
	String [] students;
	int numberOfStudents = students.length;
	
	// Create a new course with a specified name
	Course(String courseName) {
		courseName = this.courseName;
	}
	
	public void getCourseName() {
		System.out.println("Test 21");
	}
	
	public void addStudent(String student) {
		students[students.length] = student;
	}
	
	/*public void dropStudent(String student) {
		if(student)
	}*/
	
}
