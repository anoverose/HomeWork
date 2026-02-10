package class3;
import java.util.Scanner;
public class MainShop {
     static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter shop name: ");
        String shopName = sc.nextLine();
        InfoShop shop1 = new InfoShop(shopName);

        System.out.print("How many products do you have? ");
        int counter = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < counter; i++) {
            System.out.print("Enter product " + (i + 1) + ": ");
            String product = sc.nextLine();
            shop1.addProduct(product);

            System.out.print("Enter price for " + product + ": ");
            int price = sc.nextInt();
            sc.nextLine();
            shop1.addPrice(price);
        }
        shop1.printInfo();
        sc.close();
    }
}
