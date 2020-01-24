import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;

public class ExchangeTest {
    @Test
    public void exchange_displays_message_for_when_there_are_no_orders() {
        Exchange exchange = new Exchange();
        ArrayList<Order> orders = exchange.getOrders();

        String actual = exchange.display(orders);
        String expected = "There are no orders";

        assertEquals(expected, actual);
    }

    @Test
    public void exchange_displays_one_order() {
        Exchange exchange = new Exchange();
        ArrayList<Order> mockOrders =  new ArrayList<>();
        mockOrders.add(new Order("1234", "$10.00"));
        exchange.setOrders(mockOrders);
        ArrayList<Order> orders = exchange.getOrders();

        String actual = exchange.display(orders);
        String expected = "ID: 1234 Price: $10.00";

        assertEquals(expected, actual);
    }
}
