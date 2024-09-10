import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OnlineShoppingCartTest {
    @Test
    public void testCartOperations() {
        OnlineShoppingCart cart = new OnlineShoppingCart();
        cart.addProduct("Laptop");
        cart.addProduct("Smartphone");
        assertEquals(2, cart.getCartItems().size());
        cart.removeProduct("Smartphone");
        assertEquals(1, cart.getCartItems().size());
        cart.checkout();
        assertEquals(0, cart.getCartItems().size());
    }
}
