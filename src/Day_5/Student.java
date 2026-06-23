package Day_5;

public class Student implements Comparable<Student> {

    private int rollNo;
    private String name;
    private int mark;

    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public int compareTo(Student s) {
        return Integer.compare(this.rollNo, s.rollNo);
    }

    public String toString() {
        return "Roll No: " + rollNo +
               ", Name: " + name +
               ", Mark: " + mark;
    }
}