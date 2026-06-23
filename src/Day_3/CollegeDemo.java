package Day_3;

interface College {

    String collegeName = "KCE";

    static void displayCollege() {
        System.out.println("College Name: " + collegeName);
    }
}

class StudentDetails implements College {

    int studentId;
    String studentName;

    StudentDetails(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + collegeName);
    }
}

public class CollegeDemo {

    public static void main(String[] args) {

        College.displayCollege();

        StudentDetails s = new StudentDetails(101, "Dinesh");

        s.displayStudentDetails();
    }
}