package Week4Homework3.Entities;

public class Gamer implements Entity {
	private int id;
	private String name;
	private String lastName;
	private String nationalIdentity;
	private int birthDate;
	
	public Gamer() {
		
	}

	public Gamer(int id, String name, String lastName, String nationalIdentity, int birthDate) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}
	
	
}
