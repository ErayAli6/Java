package eratait;

public class MainClass {

	public static void main(String[] args) {
		Person person1 = new Person("Иван", 20);
		Student student1 = new Student("Георги", 22, "1801325812", "СИ");
		Employee employee1 = new Employee("Пенка", 40, "57811", "18.09.2016г.");

		Staff staff1 = new Staff("Йордан", 45, "48193", "19.09.2014г.", "Асистент");
		Staff staff2 = new Staff("Пенко", 60, "41568", "10.09.2010г.", "Чистач");

		Faculty faculty1 = new Faculty("Никола", 55, "49113", "01.10.2017г.", "Секретар");
		Faculty faculty2 = new Faculty("Васил", 65, "51941", "11.10.2013г.", "Майстор");

		person1.getInfo();
		student1.getInfo();
		employee1.getInfo();
		staff1.getInfo();
		staff2.getInfo();
		faculty1.getInfo();
		faculty2.getInfo();
	}

}
