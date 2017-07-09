import java.time.LocalDate;

public enum Classification {

	STANDARD(8), OAP(6), STUDENT(6), CHILD(4);

	private int value;

	private Classification(int value) {
		this.value = value;
	}

	public int getPrice() {
		return value;
	}
}
