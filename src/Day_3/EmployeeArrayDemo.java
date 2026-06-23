package Day_3;

class Employeee {

    int employeeId;
    String employeeName;
    double salary;

    Employeee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

public class EmployeeArrayDemo {

    public static void main(String[] args) {

        Employeee[] emp = new Employeee[5];

        emp[0] = new Employeee(101, "Arul", 25000);
        emp[1] = new Employeee(102, "Vijay", 35000);
        emp[2] = new Employeee(103, "Dinesh", 45000);
        emp[3] = new Employeee(104, "Kumar", 28000);
        emp[4] = new Employeee(105, "Ravi", 50000);

        System.out.println("Employees with Salary > 30000\n");

        for (int i = 0; i < emp.length; i++) {
            if (emp[i].salary > 30000) {
                emp[i].display();
            }
        }
    }
}