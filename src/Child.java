public class Child extends Person {
	
    private Classification type = Classification.CHILD;

	@Override
	public int getPrice() {
		return type.getPrice();
	}
}
