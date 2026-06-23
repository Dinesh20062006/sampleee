package Day_5;

import java.util.ArrayList;

public class EmployeeArrayListOperations {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.add("Dinesh");
        employees.add("Arun");
        employees.add("Kavin");
        employees.add("Priya");
        employees.add("Nisha");

        System.out.println("Initial Employee List:");
        System.out.println(employees);

        employees.add(2, "Rahul");
        System.out.println("\nAfter Adding Rahul at Index 2:");
        System.out.println(employees);

        employees.remove("Kavin");
        System.out.println("\nAfter Removing Kavin:");
        System.out.println(employees);

        System.out.println("\nDoes Arun exist? "+ employees.contains("Arun"));

        System.out.println("Index of Priya: "+ employees.indexOf("Priya"));

        employees.set(1, "Vijay");
        System.out.println("\nAfter Replacing Arun with Vijay:");
        System.out.println(employees);

        System.out.println("\nEmployee at Index 2: "+ employees.get(2));

        System.out.println("\nIs Employee List Empty? " + employees.isEmpty());

        System.out.println("Total Employees: " + employees.size());

        employees.clear();
        System.out.println("\nAfter Clearing Employee List:");
        System.out.println(employees);

    }
}