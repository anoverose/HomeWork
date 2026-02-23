package class5;
public class Info {
    static void main(String[] args) {
        Person chilovek = new Person("Ani", "kim", 25, 187);
//        chilovek.name="Ani";
        chilovek.print();
        Employee rabotnic1 = new Employee("Sani","Amanov",14, 193);
//        rabotnic1.name="Sina";
        rabotnic1.print();

        Employee rebotnic2 = new Employee("Kani","Askarov",15, 156);
//        rebotnic2.name="Kurt";
        rebotnic2.print();
    }
}
