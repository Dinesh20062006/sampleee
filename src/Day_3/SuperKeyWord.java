package Day_3;
class Person{
    String name;
	 int age;
	public Person(String name,int age) {
      this.name = name ;
      this.age = age;
	}
	public String toString()
	{
		return "Name :"+name +"Age : "+age;
	}
}
class Student extends Person{
    private int rollNo;
    private String dept;
    
	public Student(String name, int age,int rollNo,String dept) {
		super(name, age);
		this.name=name;
		
		this.rollNo=rollNo;
		this.dept=dept;
	}
	public String toString()
	{
		return "Name :"+name +"\nRoll No : " +rollNo+"\nAge : "+age+"\nDepartment:"+dept;
	}
	
}
public class SuperKeyWord {
public static void main(String[] args) {
	Student s=new Student("Dinesh", 215, 20, "CSE");
	System.out.println(s.toString());
}
}
