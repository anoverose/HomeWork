package class4;
import java.util.ArrayList;
public class Store {
    ArrayList<Product> products = new ArrayList<>();
    void addProduct(Product product) {
        products.add(product);
    }
    void printAllProducts() {
        System.out.println("----- All products -----");
        for (Product p : products) {
            p.printInfo();
        }
    }
    void printByCategory(String category){
        System.out.println("----- " + category + " -----");
        for(Product p : products){
            if(p.getCategory().equalsIgnoreCase(category)){
                p.printInfo();
            }
        }
    }
}