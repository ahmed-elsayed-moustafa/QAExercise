/**
 * Created by Ahmed on 09/07/2017.
 */
public class Standard extends Customer{


    private Classification type = Classification.STANDARD;

    @Override
    public int getPrice() {
        return type.getPrice();
    }

}
