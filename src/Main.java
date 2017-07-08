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
		System.out.format(" %d for %s%n", 0,"child");
		System.out.format(" %d for %s%n", 1,"student");
		System.out.format(" %d for %s%n", 2,"OAP/Old Person");
		System.out.format(" %d for %s%n", 3,"Standard");


		while (number-- > 0) {
			m.classify(sc.nextInt());
		}
		sc.close();
		int total = 0;

		for (Person p : m.getPeople()) {
			total += p.getPrice();
		}

		System.out.format("The total cost of tickets for this movie is £%d", total);
	}

	public void classify(int type) {
		switch (type) {
		case 0:
			people.add(new Child());
			break;
		case 1:
			people.add(new Student());
			break;
		case 2:
			people.add(new OAP());
			break;
		default:
			people.add(new Standard());
			break;
		}
	}

	public ArrayList<Person> getPeople() {
		return people;
	}
}
