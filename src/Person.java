public class Person {
	
	protected Classification type;
	
	Person(){
		type=Classification.STANDARD;
	}
	
	public Classification getType(){
		return type;
	}
	
}
