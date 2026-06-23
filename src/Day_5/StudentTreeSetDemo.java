package Day_5;

import java.util.TreeSet;

public class StudentTreeSetDemo {

    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();

        students.add(new Student(103, "Ravi", 78));
        students.add(new Student(101, "Arul", 85));
        students.add(new Student(105, "Kavin", 88));
        students.add(new Student(102, "Priya", 90));
        students.add(new Student(104, "Nisha", 82));

        System.out.println("Student Details in Sorted Order:");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}