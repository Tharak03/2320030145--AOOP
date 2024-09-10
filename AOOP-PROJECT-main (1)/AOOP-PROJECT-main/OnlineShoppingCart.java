import java.util.ArrayList;
import java.util.List;

public class OnlineShoppingCart {
    private List<String> cartItems;

    public OnlineShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addProduct(String product) {
        cartItems.add(product);
        System.out.println(product + " added to cart.");
    }

    public void removeProduct(String product) {
        if (cartItems.remove(product)) {
            System.out.println(product + " removed from cart.");
        } else {
            System.out.println(product + " not found in cart.");
        }
    }

    public void checkout() {
        if (cartItems.isEmpty()) {
            System.out.println("Cart is empty. Nothing to checkout.");
        } else {
            System.out.println("Checking out the following items:");
            for (String item : cartItems) {
                System.out.println("- " + item);
            }
            cartItems.clear();
            System.out.println("Checkout complete.");
        }
    }

    public List<String> getCartItems() {
        return cartItems;
    }
}
