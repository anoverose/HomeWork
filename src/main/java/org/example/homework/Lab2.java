package org.example.homework;
import java.util.ArrayList;
import java.util.Scanner;
public class Lab2 {
     static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        boolean addMore = true;
        while (addMore) {
            System.out.print("Enter the student name: ");
            name.add(sc.nextLine());
            System.out.println("Student name is " + name);

            ArrayList<String> subjects = new ArrayList<>();
            ArrayList<Integer> grades = new ArrayList<>();
            System.out.print("How many subjects? ");
            int subjectCount = sc.nextInt();
            sc.nextLine();
            int sum = 0;
            for (int i = 0; i < subjectCount; i++) {
                System.out.print("Enter subject " + (i + 1)+": ");
                String subject = sc.nextLine();
                subjects.add(subject);

                System.out.print("Enter grade for: " + subject+": " );
                int grade = sc.nextInt();
                sc.nextLine();
                if (grade >= 1 && grade <= 5) {
                    grades.add(grade);
                    sum += grade;
                } else {
                    System.out.println("Wrong grade, skipped");
                }
            }
            double average = (double) sum / grades.size();
            System.out.println("Subjects: " + subjects);
            System.out.println("Grades: " + grades);
            System.out.println("Average grade: " + average);
            System.out.print("Add another student? (yes/no): ");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                addMore = true;
            } else {
                addMore = false;
                System.out.println("Program finished!");
            }
        }
    }
}