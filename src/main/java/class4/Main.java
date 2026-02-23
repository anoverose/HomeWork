package class4;
import java.util.Scanner;
public class Main {
     static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Store store = new Store();
        while(true){
            System.out.println("===== MENU =====");
            System.out.println("1. Add product");
            System.out.println("2. Show all products");
            System.out.println("3. Show products by category");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1){

                System.out.print("Name of product: ");
                String name = sc.nextLine();

                System.out.print("Price: ");
                double price = sc.nextDouble();

                System.out.print("Quantity: ");
                int quantity = sc.nextInt();
                sc.nextLine();

                System.out.print("Category (Food / Soap / Cleaning / Drinks): ");
                String category = sc.nextLine();

                Product product = new Product(name, price, quantity, category);
                store.addProduct(product);

                System.out.println("Product added successfully!");

            }
            else if(choice == 2){
                store.printAllProducts();
            }
            else if(choice == 3){
                System.out.print("Enter category: ");
                String category = sc.nextLine();
                store.printByCategory(category);
            }
            else if(choice == 4){
                System.out.println("Goodbye!");
                break;
            }
            else{
                System.out.println("Invalid option!");
            }
        }
    }
}
