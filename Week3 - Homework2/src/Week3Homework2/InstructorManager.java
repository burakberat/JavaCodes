package Week3Homework2;

public class InstructorManager extends UserManager {
	public void display(User user) {
		System.out.println(user.getName() + " " + user.getLastName()+ " g�r�nt�lendi.");
		System.out.println(user.getName() + " 'in verdi�i kurs: " + user.getCourse());
	}
}
