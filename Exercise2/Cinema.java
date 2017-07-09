import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by Ahmed on 08/07/2017.
 */
public class Cinema {

    private String dow = LocalDate.now().getDayOfWeek().toString().toLowerCase();

    public double computeTicketPrices(ArrayList<Customer> customers){
        double total = 0;
        for (Customer c : customers) {
            int price = c.getPrice();
            if(dow.equals("wednesday")) price-=2;
            total+=price;
        }

        return total;
    }


}
