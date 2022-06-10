package eratait;

public class Faculty extends Employee {

	private String position;

	public Faculty(String name, int age, String personalNumber, String dateOfAccession, String position) {
		super(name, age, personalNumber, dateOfAccession);
		if (position.equalsIgnoreCase("учебен отдел") || position.equalsIgnoreCase("секретар"))
			this.position = position;
		else {
			System.out.println("Зададена грешна длъжност на Faculty с име: " + getName()
					+ "!!! Трябва да е или учебен отдел,или секретар!");
			this.position = "Грешна длъжност!!!";
		}
	}

	@Override
	public void getInfo() {
		System.out
				.println("Име: " + getName() + "\t Възраст: " + getAge() + "\t Персонален номер: " + getPersonalNumber()
						+ "\t Дата на присъединяване: " + getDateOfAccession() + "\t Длъжност:" + position);
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		if (position.equalsIgnoreCase("учебен отдел") || position.equalsIgnoreCase("секретар"))
			this.position = position;
		else
			System.out.println("Зададена грешна длъжност на Faculty с име: " + getName() + "!!!");
	}

}
