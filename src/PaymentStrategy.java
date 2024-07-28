import java.util.ArrayList;
import java.util.List;

public abstract class PaymentStrategy {
    public abstract void pay(int amount);
}

class CreditCardStrategy extends PaymentStrategy {
    private String cardNumber;

    public CreditCardStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card: " + cardNumber);
    }
}

class PaypalStrategy extends PaymentStrategy {
    private String emailId;

    public PaypalStrategy(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal: " + emailId);
    }
}

class ShoppingCart {
    private List<Item> items;
    private PaymentStrategy paymentStrategy;

    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.items = new ArrayList<>();
        this.paymentStrategy = paymentStrategy;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void checkout() {
        int total = items.stream().mapToInt(Item::getPrice).sum();
        paymentStrategy.pay(total);
    }
}

class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class Mainer {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new PaypalStrategy("myemail@example.com"));
        cart.addItem(new Item("Book", 10));
        cart.addItem(new Item("Pen", 2));
        cart.checkout();

        cart = new ShoppingCart(new CreditCardStrategy("1234-5678-9101-1121"));
        cart.addItem(new Item("Notebook", 5));
        cart.checkout();
    }
}
