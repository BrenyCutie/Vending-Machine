/**
 A product in a vending machine.
 */
public class Product
{
    private String description;
    private double price;
    private String[] list = new String[9];
    /**
     Constructs a Product object
     @param aDescription the description of the product
     @param aPrice the price of the product
     */
    public Product(String aDescription, double aPrice)
    {
        description = aDescription;
        price = aPrice;
    }

}
