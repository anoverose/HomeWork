package org.example.arrays;

import java.util.ArrayList;

public class ArrayListEx {
    static void main(String[] args) {
        ArrayList<String>nameOfStudent = new ArrayList<>();
       nameOfStudent.add("Alice");
       nameOfStudent.add("Ali");
       nameOfStudent.add("Aidan");
        System.out.println(nameOfStudent.get(0));
        for (int i = 0; i <nameOfStudent.size() ; i++) {
            System.out.println(nameOfStudent.get(i));

        }

    }
}
