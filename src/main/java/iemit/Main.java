package iemit;
public class Main {
    static void main(String[] args) {
        Lab3 l1 = new Lab3("Alihan",23);
        l1.printInfo();
        Lab3 l2 = new Lab3("Dastan",21);
        l2.printInfo();
        Lab3 l3 = new Lab3("Aidan",22);
        l3.printInfo();

        System.out.println("Total student number: "+Lab3.count);
    }
    }
