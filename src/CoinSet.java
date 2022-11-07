import java.util.ArrayList;

/**
 * A set of coins.
 */
public class CoinSet {
    private ArrayList<Coin> set;

    /**
     * Constructs a CoinSet object.
     */
    public CoinSet() {
        set = new ArrayList<Coin>();

    }


    public void addCoin(Coin c) {
        set.add(c);
    }


    //calculate total of coins
    public double totalCoin() {
        double total = 0;
        for (Coin i : set
        ) {
            total += i.getValue();
        }
        return total;
    }

    public void empty() {
        set.clear();
    }


    public ArrayList<Coin> getSet() {
        return set;
    }
}