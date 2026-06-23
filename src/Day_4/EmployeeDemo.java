package Day_4;

abstract class Employee {
    abstract void calculateSalary();
    void displayCompanyName() {
        System.out.println("Company Name: ABC Technologies");
    }
}

class PermanentEmployee extends Employee {

    double monthlySalary = 50000;
    void calculateSalary() {
        System.out.println("Permanent Employee Salary: Rs." + monthlySalary);
    }
}

class ContractEmployee extends Employee {

    double hourlyRate = 500;
    int hoursWorked = 100;
    void calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("Contract Employee Salary: Rs." + salary);
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        PermanentEmployee p = new PermanentEmployee();
        p.displayCompanyName();
        p.calculateSalary();

        System.out.println();

        ContractEmployee c = new ContractEmployee();
        c.displayCompanyName();
        c.calculateSalary();
    }
}