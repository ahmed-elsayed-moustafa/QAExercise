import java.util.ArrayList;

/**
 * Created by Ahmed on 08/07/2017.
 */
public class Cinema {


    public double computeTicketPrices(ArrayList<Customer> customers){
        double total = 0;
        for (Customer c : customers) {
            total += c.getPrice();
        }

        return total;
    }

}
