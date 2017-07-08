import java.util.ArrayList;

/**
 * Created by Ahmed on 08/07/2017.
 */
public class Cinema {

    private int total = 0;

    Cinema(ArrayList<Customer> customers){
        computeTicketPrices(customers);
    }

    public void computeTicketPrices(ArrayList<Customer> customers){
        for (Customer c : customers) {
            total += c.getPrice();
        }
    }


    @Override
    public String toString(){
        return "The total cost of tickets for this movie is £"+total;
    }

}
