import java.util.ArrayList;

/**
 A set of coins.
 */
public class CoinSet
{
    private ArrayList<Coin> set;

    /**
     Constructs a CoinSet object.
     */
    public CoinSet()
    {
        set = new ArrayList<Coin>();

    }

    public  double counter() {
        double sum = 0;
        for (int i = 0; i < set.size(); i++) {
             sum += set.get(i).getValue();
        }
                return sum ;

    }
}