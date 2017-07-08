
public class Student extends Person {

    private Classification type = Classification.STUDENT;

    @Override
    public int getPrice() {
        return type.getPrice();
    }
}
