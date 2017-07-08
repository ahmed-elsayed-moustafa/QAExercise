public class Standard extends Person{

    private Classification type = Classification.STANDARD;

    @Override
    public int getPrice() {
        return type.getPrice();
    }

}
