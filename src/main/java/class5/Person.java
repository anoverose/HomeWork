package class5;
public class Person {
        String name;
        String surname;
        int age;
        int height;
        Person(String name,String surname,int age, int height){
            this.name = name;
            this.surname = surname;
            this.age =age;
            this.height = height;
        }
        void print(){
            System.out.println("Name: "+name);
            System.out.println("Surname: "+surname);
            System.out.println("Age: "+age);
            System.out.println("Height: "+height);
        }
    }
