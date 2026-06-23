package Day_4;

interface StudentAccess {
    void fetchStudent(int id);
    void editStudent(int id);
    void saveStudent(Student student);
}

class Student implements StudentAccess {
    int id;
    String name;

    Student() {
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void fetchStudent(int id) {
        System.out.println("Fetching Student with ID: " + id);
    }

    public void editStudent(int id) {
        System.out.println("Editing Student with ID: " + id);
    }

    public void saveStudent(Student student) {
        System.out.println("Saving Student: " + student.name);
    }
    public void deleteStudent(int id) {
        System.out.println("Deleting Student with ID: " + id);
    }
}

public class StudentDemo {

    public static void main(String[] args) {
        StudentAccess sa = new Student();
        sa.fetchStudent(101);
        sa.editStudent(101);
        sa.saveStudent(new Student(101, "Dinesh"));
        Student s = new Student();
        s.deleteStudent(101); 
   }
}