package Day_3;

abstract class Person1 {

    abstract void displayDetails();
}

interface SalaryCalculation {

    void calculateSalary();
}

class Emp extends Person1 implements SalaryCalculation {

    int employeeId;
    String employeeName;
    double salary;

    Emp(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    @Override
    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Salary: Rs." + salary);
    }
}

public class EmployeeSalaryDemo {

    public static void main(String[] args) {

        Emp emp = new Emp(101, "Dinesh", 45000);

        emp.displayDetails();
        emp.calculateSalary();
    }
}