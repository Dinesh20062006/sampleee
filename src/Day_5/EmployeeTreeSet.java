package Day_5;

import java.util.TreeSet;

public class EmployeeTreeSet {

    public static void main(String[] args) {
        TreeSet<Integer> employeeIds = new TreeSet<>();

        employeeIds.add(105);
        employeeIds.add(102);
        employeeIds.add(109);
        employeeIds.add(101);
        employeeIds.add(103);
        employeeIds.add(102); 

        System.out.println("Sorted Employee IDs:");
        for (Integer id : employeeIds) {
            System.out.println(id);
        }
    }
}