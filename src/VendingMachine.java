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
            Product[] getter = new Product[products.size()];
            for (int i = 0; i < getter.length; i++) {
                getter[i] = products.get(i);
            }
            return getter;
        }





    public void buyProduct(Product p) {
        ArrayList<Coin> in = currentCoins.getSet();
        for (Coin c : in) {
            coins.addCoin(c);
            if (products.contains(p) && coins.totalCoin() >= p.getPrice()) {
                products.remove(p);
            } else {
                throw new VendingException("Inssufficient funds");

            }
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

