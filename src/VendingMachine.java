import java.util.ArrayList;

/**
 * A vending machine.
 */
public class VendingMachine {
    private ArrayList<Product> products;
    public CoinSet coins;
    public CoinSet currentCoins;

    /**
     * Constructs a VendingMachine object.
     */
    public VendingMachine() {
        products = new ArrayList<Product>();
        coins = new CoinSet();
        currentCoins = new CoinSet();
    }

    public void addProduct(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            products.add(product);
        }
    }


    public Product[] getProductTypes() {
        ArrayList<Product> getter = new ArrayList<Product>();
        for (Product p: products) {
            if(!getter.contains(p)){
                getter.add(p);
        }
        }
        Product[] visible = new Product[getter.size()];
            for (Product x :getter) {
                visible[getter.indexOf(x)] = x;
            }
            return visible;
    }



    public void buyProduct(Product p) {
        ArrayList<Coin> in = currentCoins.getSet();
        for (Coin c : in) {
            coins.addCoin(c);}
        if (products.contains(p) && currentCoins.totalCoin() >= p.getPrice()) {
            products.remove(p);
        } else {
            throw new VendingException("Insufficient funds");

        }
        currentCoins.empty();
    }

    public void addCoin(Coin choice) {
        currentCoins.addCoin(choice);
    }


    public double removeMoney() {
        double total = coins.totalCoin();
        coins.empty();
        return total;
    }
}

