package org.example;
public class ex1 {
    String name = "Aidana";
    int age = 27;

     static void main(String[] args) {
        ex1 obj = new ex1();
        obj.printName("Aidan");
         obj.printAge(23);
    }
    void printName(String name) {
        System.out.println(name);
        System.out.println(this.name);
        ///если два имени программа дает одно и тоже имя а когда пишешь "this" он пишеть второе имя которая в коде
    }
    void printAge(int age) {
        System.out.println(age);
        System.out.println(this.age);
    }
}
