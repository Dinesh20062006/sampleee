package Day_3;

class Employe {

    int employeeId;
    String employeeName;

    Employe(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    void displayDetails() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
    }
}

public class PackageDemo {

    public static void main(String[] args) {

        Employe emp = new Employe(101, "Dinesh");

        emp.displayDetails();
    }
}