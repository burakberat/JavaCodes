package Week3Homework2;

public class StudentManager extends UserManager {
	public void add(User user) {
		System.out.println(user.getName() + " " + user.getLastName()+ " sisteme eklendi.");
		System.out.println(user.getName() + " 'in aldýðý kurs: " + user.getCourse());
	}

}
