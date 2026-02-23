package class5;
public class Person {
        String name;
        String surname;
        int age;
        int hight;
        Person(String name,String surname,int age, int hight){
            this.name = name;
            this.surname = surname;
            this.age =age;
            this.hight = hight;
        }
        void print(){
            System.out.println("Name: "+name);
            System.out.println("Surname: "+surname);
            System.out.println("Age: "+age);
            System.out.println("Hight: "+hight);
        }
    }
