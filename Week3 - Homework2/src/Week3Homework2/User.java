package Week3Homework2;

public class User {
	private String name;
	private String lastName;
	private String course;
	private int id;
	
	public User() {
		
	}
	
	public User(String name, String lastName, String course, int id) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.course = course;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
