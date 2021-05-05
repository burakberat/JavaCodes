package Week3Homework2;

public class InstructorManager extends UserManager {
	public void display(User user) {
		System.out.println(user.getName() + " " + user.getLastName()+ " görüntülendi.");
		System.out.println(user.getName() + " 'in verdiði kurs: " + user.getCourse());
	}
}
