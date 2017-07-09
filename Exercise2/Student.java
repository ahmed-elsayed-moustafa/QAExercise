/**
 * Created by Ahmed on 09/07/2017.
 */
public class Student extends Customer{

    private Classification type = Classification.STUDENT;

    @Override
    public int getPrice() {
        return type.getPrice();
    }

}
