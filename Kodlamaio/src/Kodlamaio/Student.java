package Kodlamaio;

public class Student {

	int id;
	String studentName;
	Course[] courses;
	
	public Student(int id, String studentName, Course[] courses) {
	
		this.id= id;
		this.studentName = studentName;
		this.courses = courses;
	}
}
