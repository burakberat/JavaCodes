package Kodlamaio;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		
		Course course1 = new Course(1, "Java", "Engin Demiroğ", 0, "100 Hours");
		
		Course course2 = new Course(2, "C#", "Engin Demiroğ", 0, "120 Hours");
		
		Course[] courses= {course1, course2};
		
		for(Course course: courses)
		{
			System.out.println(course.courseName);
		}
		
		Student student1 = new Student(1 , "Burak Orucoglu", new Course[] {course1});
		
		Student student2= new Student(2,"Ahmet Ak", new Course[] {course2});
		
		Student[] students = {student1,student2};
		
		for(Student student: students)
		{
			System.out.println(student.studentName);
		}
		
		
		CourseService courseService = new CourseService();
		
		courseService.addCourse(course2);
		
	}

}
