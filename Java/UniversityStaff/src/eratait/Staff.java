package eratait;

public class Staff extends Employee {

	private String position;

	public Staff(String name, int age, String personalNumber, String dateOfAccession, String position) {
		super(name, age, personalNumber, dateOfAccession);
		if (position.equalsIgnoreCase("асистент") || position.equalsIgnoreCase("доцент")
				|| position.equalsIgnoreCase("професор"))
			this.position = position;
		else {
			System.out.println("Зададена грешна длъжност на Staff с име: " + getName()
					+ "!!! Трябва да е или асистент,или доцент,или професор!");
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
		if (position.equalsIgnoreCase("асистент") || position.equalsIgnoreCase("доцент")
				|| position.equalsIgnoreCase("професор"))
			this.position = position;
		else
			System.out.println("Зададена грешна длъжност на Staff с име: " + getName() + "!!!");
	}

}
