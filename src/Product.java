import java.util.ArrayList;

/**
 * A product in a vending machine.
 */
public class Product {
    private String description;
    private double price;

    /**
     * Constructs a Product object
     *
     * @param aDescription the description of the product
     * @param aPrice       the price of the product
     */

    //constructor
    public Product(String aDescription, double aPrice) {
        description = aDescription;
        price = aPrice;

    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Product - " +
                "description = " + description + '\'' +
                " price = " + price;
    }
}
