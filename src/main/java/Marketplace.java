import java.util.ArrayList;
import java.util.BitSet;

public class Marketplace {
    private ArrayList<Offer> offers = new ArrayList<>();

    public String display(ArrayList<Order> orders) {
        String result = "";
        if (orders.size() > 0) {
            for (Order order : orders) {
                result += "ID: " + order.getId() + " Price: " + order.getPrice() + "\n";
            }
            return result;
        }
        return "There are no orders";
    }

    public ArrayList<Offer> getOffers() {
        return offers;
    }

    public Offer add(User user, int numberOfCoins) {
        Offer offer = new Offer();
        this.offers.add(offer);
        return offer;
    }
}
