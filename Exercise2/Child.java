/**
 * Created by Ahmed on 09/07/2017.
 */
public class Child extends Customer{

    private Classification type = Classification.CHILD;

    @Override
    public int getPrice() {
        return type.getPrice();
    }
}
