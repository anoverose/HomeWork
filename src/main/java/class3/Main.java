package class3;
import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student name: ");
        String name = sc.nextLine();

        StudentInfo student1 = new StudentInfo(name);

        System.out.println("Enter the subject: ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i <count ; i++) {
            System.out.println("Enter the subject: "+(i+1));
            String subject = sc.nextLine();
            student1.addProduct(subject);

            System.out.println("Enter the greads: "+subject);
            int gread = sc.nextInt();
            sc.nextLine();
            student1.addgreads(gread);
        }
        student1.printInfo();
    }
}
