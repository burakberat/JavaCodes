package Week3Homework2;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Burak Berat");
		student1.setLastName("Orucoglu");
		student1.setStudentNumber("1001");
		student1.setCourse("Java");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(2);
		instructor1.setName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setInstructorNumber("2001");
		instructor1.setCourse("Java");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.doSomething(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.display(instructor1);
		instructorManager.doSomething(instructor1);
		

	}

}
