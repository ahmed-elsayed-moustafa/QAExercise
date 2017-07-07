import java.time.LocalDate;

public enum Classification {

	STANDARD(8), OAP(6), STUDENT(6), CHILD(4);

	private int value;

	private String dow = LocalDate.now().getDayOfWeek().toString();

	private Classification(int value) {
		this.value = value;
	}

	public int getPrice() {
		if (dow.equals("WEDNESDAY")) {
			return value -= 2;
		}

		return value;
	}
}
