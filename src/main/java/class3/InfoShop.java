package class3;
import java.util.ArrayList;
public class InfoShop {
    String shopName;
    ArrayList<String> products = new ArrayList<>();
    ArrayList<Integer> prices = new ArrayList<>();

    public InfoShop(String shopName) {
        this.shopName = shopName;
    }
    void addProduct(String product) {
        products.add(product);
    }
    void addPrice(int price) {
        prices.add(price);
    }
    double total() {
        if (prices.size() == 0) return 0;

        int totalSum = 0;
        for (int price : prices) {
            totalSum += price;
        }
        return totalSum;
    }
    void printInfo() {
        System.out.println("Shop name: " + shopName);
        System.out.println("Products: " + products);
        System.out.println("Prices: " + prices);
        System.out.println("Total sum: " + total());
    }
}
