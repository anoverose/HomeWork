package class4;
public class Product {
    String name;
    double price;
    int quantity;
    String category;
    public Product(String name, double price, int quantity, String category){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }
    void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Category: " + category);
        System.out.println("--------------------");
    }
    String getCategory(){
        return category;
    }
}
