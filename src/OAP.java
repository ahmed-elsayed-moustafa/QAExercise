/**
 * Created by Ahmed on 09/07/2017.
 */
public class OAP extends Customer {

    private Classification type = Classification.OAP;

    @Override
    public int getPrice() {
        return type.getPrice();
    }

}
