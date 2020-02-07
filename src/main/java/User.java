public class User {
    public User(PaypalBalance paypalBalance) {

    }

    public void buy(Offer offer) {
    }

    public Offer sell(int numberOfCoins, Marketplace marketplace) {
        return marketplace.add(this, numberOfCoins);
    }

    public Integer getPaypalBalance() {
        return 10;
    }
}
