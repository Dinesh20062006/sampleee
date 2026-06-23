package Day_3;

class Employee {
    public void calculateSalary() {
        System.out.println("Calculating Employee Salary");
    }
}

class FullTimeEmployee extends Employee {
    
    public void calculateSalary() {
        int salary = 50000;
        System.out.println("Full-Time Employee Salary: " + salary);
    }
}

class PartTimeEmployee extends Employee {
    
    public void calculateSalary() {
        int hours = 40;
        int rate = 300;
        int salary = hours * rate;

        System.out.println("Part-Time Employee Salary: " + salary);
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee emp1 = new FullTimeEmployee();
        Employee emp2 = new PartTimeEmployee();

        emp.calculateSalary();
        emp1.calculateSalary();
        emp2.calculateSalary();
    }
}