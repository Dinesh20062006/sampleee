package Day_5;

import java.util.ArrayList;

public class StudentNames {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Dinesh");
        students.add("Arun");
        students.add("Kavin");
        students.add("Priya");
        students.add("Nisha");

        System.out.println("Student Names:");
        for (String name : students) {
            System.out.println(name);
        }

        students.add("Dinesh");

        students.add(null);

        System.out.println("\nAfter Adding Duplicate and Null:");
        System.out.println(students);

        System.out.println("\nSize of ArrayList: " + students.size());
    }
}