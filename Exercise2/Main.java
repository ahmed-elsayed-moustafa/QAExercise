import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private ArrayList<Customer> customers = new ArrayList<Customer>();

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

		Cinema c= new Cinema();

		double price = c.computeTicketPrices(m.getCustomers());

		System.out.printf("The total cost of the tickets is £%.2f%n", price);
	}

	public void classify(int type) {
		switch (type) {
		case 0:
			customers.add(new Child());
			break;
		case 1:
			customers.add(new Student());
			break;
		case 2:
			customers.add(new OAP());
			break;
		default:
			customers.add(new Standard());
			break;
		}
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}
}
