
public class OAP extends Person {

	private Classification type = Classification.OAP;


	@Override
	public int getPrice() {
		return type.getPrice();
	}
}