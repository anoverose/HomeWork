package iemit;
public class Lab3 {
    String name ;
    int age ;
    static int count = 0;
    public Lab3(String name, int age){
        this.name = name;
        this.age = age;
        count++;

    }
    void printInfo(){
        System.out.println("Student name: "+name+", Age: "+age);
    }
}