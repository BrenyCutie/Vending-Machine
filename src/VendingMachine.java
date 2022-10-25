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


    public int finder(Product p) {
        int ans = 0;

        for (int i = 0; i < products.size(); i++) {
            if (p.getDescription().equals(products.get(i).getDescription())) {
                ans = i;
            }
        }
        return ans;
    }
        public void buyProduct (Product p ){
                if (products.contains(p) && Coin > p.getPrice()) {
                    products.remove(finder(p));
                    coins.counter() -= p.getPrice();
                }
            }

    public void addCoin(Coin choice) {

    }
}

