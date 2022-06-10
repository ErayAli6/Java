package eratait;

public class Employee extends Person {

	private String personalNumber;
	private String dateOfAccession;

	public Employee(String name, int age, String personalNumber, String dateOfAccession) {
		super(name, age);
		this.personalNumber = personalNumber;
		this.dateOfAccession = dateOfAccession;
	}

	@Override
	public void getInfo() {
		System.out.println("Име: " + getName() + "\t Възраст: " + getAge() + "\t Персонален номер: " + personalNumber
				+ "\t Дата на присъединяване: " + dateOfAccession);
	}

	public String getPersonalNumber() {
		return personalNumber;
	}

	public void setPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}

	public String getDateOfAccession() {
		return dateOfAccession;
	}

	public void setDateOfAccession(String dateOfAccession) {
		this.dateOfAccession = dateOfAccession;
	}

}
