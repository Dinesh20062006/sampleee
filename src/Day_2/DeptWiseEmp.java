package Day_2;
public class DeptWiseEmp {
    public static void main(String[] args) {

        int[][] departments = new int[3][];

        departments[0] = new int[]{101, 102, 103};
        departments[1] = new int[]{201, 202};
        departments[2] = new int[]{301, 302, 303, 304};

        int totalEmployees = 0;

        System.out.println("Department-wise Employee Count:");

        for (int i = 0; i < departments.length; i++) {
            int count = departments[i].length;
            System.out.println("Department " + (i + 1) + ": " + count + " employees");
            totalEmployees += count;
        }

        System.out.println("\nTotal Employees: " + totalEmployees);
    }
}