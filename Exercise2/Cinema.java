import java.util.ArrayList;

/**
 * Created by Ahmed on 08/07/2017.
 */
public class Cinema {

    private ArrayList<Customer> customers;

    Cinema(ArrayList<Customer> customers){
        this.customers=customers;
    }

    public double computeTicketPrices(ArrayList<Customer> customers){
        double total = 0;
        for (Customer c : customers) {
            total += c.getPrice();
        }

        return total;
    }


    @Override
    public String toString(){
        return "The total cost of tickets for this movie is £"+computeTicketPrices(customers);
    }

}
