import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private ArrayList<Person> people = new ArrayList<Person>();

	public static void main(String[] args) {

		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many are going to see the Movie?");
		int number = sc.nextInt();
		System.out.println("Please enter the classification?");

		while (number-- > 0) {
			m.classify(sc.next().toLowerCase());
		}
		sc.close();
		int total = 0;

		for (Person p : m.getPeople()) {
			total += p.getType().getPrice();
		}

		System.out.format("The total cost of tickets for this movie is £%d", total);
	}

	public void classify(String type) {
		switch (type) {
		case "child":
			people.add(new Child());
			break;
		case "oap":
			people.add(new OAP());
			break;
		case "pensioner":
			people.add(new OAP());
			break;
		case "student":
			people.add(new Student());
			break;
		default:
			people.add(new Person());
			break;
		}
	}

	public ArrayList<Person> getPeople() {
		return people;
	}
}
