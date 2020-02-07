import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ExchangeTest {

    /*
    Given I have 100 coins from Candy Crush in my wallet
    And I want to sell the coins to get $10
    When I put an offer in the market
    And someone buys it
    Then I receive $10 in my paypal account
     */

    @Test
    public void user_sells_item_for_cash_test() {
        Wallet wallet = new Wallet("Candy Crush", 100);
        User user = new User(null);
        Offer offer = user.sell(100, null).by(10);
        User someone = new User(null);
        someone.buy(offer);
        Integer payapalBalance = user.getPaypalBalance();

        assertTrue(payapalBalance.equals(10));
    }

    @Test
    @Ignore ("Too broad")
    public void user_sells_item_for_different_amount_test() {
        Wallet wallet = new Wallet("Candy Crush", 100);
        User user = new User(null);
        Offer offer = user.sell(100, null).by(20);
        User someone = new User(null);
        someone.buy(offer);
        Integer payapalBalance = user.getPaypalBalance();

        assertTrue(payapalBalance.equals(20));
    }

    @Test
    @Ignore
    public void user_receives_money_in_paypal_balance_when_someone_buys_an_offer() {
        User user = new User(new PaypalBalance());
        Marketplace marketplace = new Marketplace();
        Offer offer = user.sell(100, marketplace).by(20);
        User someone = new User(new PaypalBalance());
        someone.buy(offer);

        assertThat(user.getPaypalBalance(), equalTo(20));
    }

    @Test
    public void exchange_trades_money_for_candy_crush_coins(){
        User user = new User(null);
        Marketplace marketplace = new Marketplace();
        Offer offer = user.sell(100, marketplace).by(20);

        assertThat(marketplace.getOffers().size(), equalTo(1));

    }

}
