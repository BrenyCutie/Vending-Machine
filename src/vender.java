import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class vender {
    private String maker;
    private double change;
    private int[] stock = new int[9];

    private    HashMap<Integer, Double> map = new HashMap<>();
    //location , price
    {  map.put(1, 1.00);
        map.put(2, 2.00);
        map.put(3, 3.00);

        map.put(4, 4.00);
        map.put(5, 5.00);
        map.put(6, 6.00);

        map.put(7, 7.00);
        map.put(8, 8.00);
        map.put(9, 9.00);}

    public vender(String maker, double change) {
        this.change = change;
        this.maker = maker;
    }

    public double checkPrice(int product) {


        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry mapper = (Map.Entry) iterator.next();

        }
        return map.get(product);
    }

    public boolean cashFlow(double coins, int item) {
        if (coins >= checkPrice(item)) {
            minusStock(item, 1);

            return true;
        }                throw new VendingException("Inssufficient funds");

    }
    public String minusStock(int item, int amount) {
        stock[item] = stock[item] - amount;
        ;
        if (stock[item] < 0) {
            stock[item] = 0;
        }
        return Arrays.toString(stock);

    }

    public String stock(int max) {
        for (int i = 0; i < 9; i++) {
            stock[i] = max;
        }
        return Arrays.toString(stock);
    }


    public static void main(String[] args) {
        vender vend = new vender("Coca Cola Vending Machine", 5);
        System.out.println(vend.maker);
        System.out.println("A crumbled $" + vend.change + " note :(");
        System.out.println("PRICE : $" + +vend.checkPrice(2));
        System.out.println("SUFFICIENT AMOUNT : " + vend.cashFlow(vend.change, 2));
        System.out.println(vend.stock(5));
        System.out.println(vend.minusStock(1,1));
        System.out.println(vend.minusStock(1,1));

        System.out.println(vend.minusStock(1,1));







    }
}