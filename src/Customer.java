public class Customer {
	
	private Classification type = null;


	Customer(Classification type){
		this.type = type;

	}

	public int getPrice(){
		return type.getPrice();
	}

}
