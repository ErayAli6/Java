package eratait;

public class Student extends Person {

	private String facNumber;
	private String specialty;

	public Student(String name, int age, String facNumber, String specialty) {
		super(name, age);
		this.facNumber = facNumber;
		this.specialty = specialty;
	}

	@Override
	public void getInfo() {
		System.out.println("Име: " + getName() + "\t Възраст: " + getAge() + "\t Факултетен номер: " + facNumber
				+ "\t Специалност: " + specialty);
	}

	public String getFacNumber() {
		return facNumber;
	}

	public void setFacNumber(String facNumber) {
		this.facNumber = facNumber;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

}
