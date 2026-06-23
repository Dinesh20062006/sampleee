package Day_4;

public class WrapperClassDemo {

    public static void main(String[] args) {

        String age = "21";
        String mark = "89.5";
        int salary = 35000;
        double percentage = 87.75;
        char section = 'A';
        int ageValue = Integer.parseInt(age);
        System.out.println("Age as int: " + ageValue);
        
        double markValue = Double.parseDouble(mark);
        System.out.println("Mark as double: " + markValue);
        
        String salaryStr = Integer.toString(salary);
        System.out.println("Salary as String: " + salaryStr);
        
        String percentageStr = Double.toString(percentage);
        System.out.println("Percentage as String: " + percentageStr);
        
        Integer num1 = 100;
        Integer num2 = 200;
        System.out.println("Compare Result: " + Integer.compare(num1, num2));
        
        System.out.println("Maximum: " + Integer.max(num1, num2));
        System.out.println("Minimum: " + Integer.min(num1, num2));
        
        Integer intObj = 500;
        int intValue = intObj.intValue();
        System.out.println("Integer Object to int: " + intValue);
        
        Double doubleObj = 95.75;
        double doubleValue = doubleObj.doubleValue();
        System.out.println("Double Object to double: " + doubleValue);
        
        System.out.println( Character.isLetter(section));
    }
}