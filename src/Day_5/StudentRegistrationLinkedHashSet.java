package Day_5;

import java.util.LinkedHashSet;

public class StudentRegistrationLinkedHashSet {

    public static void main(String[] args) {
    	LinkedHashSet<String> registrations = new LinkedHashSet<>();
        registrations.add("REG101");
        registrations.add("REG102");
        registrations.add("REG103");
        registrations.add("REG104");
        registrations.add("REG102"); 
        registrations.add("REG105");
        registrations.add("REG103");
        registrations.add("REG106");

        System.out.println("Student Registration Numbers:");
        System.out.println(registrations);
    }
}