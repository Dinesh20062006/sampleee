package Day_2;

class Person {
    String name;
    int age;

   public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employe extends Person {
    int employeeId;
    String department;

    Employe(String name, int age, int employeeId, String department) {
        super(name, age); 
        this.employeeId = employeeId;
        this.department = department;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Employe emp = new Employe("Dinesh", 20, 215, "FSJ");
        emp.display();
    }
}