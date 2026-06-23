package Day_2;
public class Employee {
    int employeeId;
    String employeeName;
    String department;
    double salary;

    public Employee(int employeeId, String employeeName, String department, double salary) 
    {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(215, "Dinesh", "CSE", 60000);

        emp.displayEmployee();
    }
}