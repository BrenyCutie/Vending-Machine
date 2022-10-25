import java.util.ArrayList;

/**
 A vending machine.
 */
public class VendingMachine
{
    private ArrayList<Product> products;
    public CoinSet coins;
    public CoinSet currentCoins;

    /**
     Constructs a VendingMachine object.
     */
    public VendingMachine()
    {
        products = new ArrayList<Product>();
        coins = new CoinSet();
        currentCoins = new CoinSet();
    }
    //ADD REMAINING CODE HERE
}