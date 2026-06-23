package Day_5;

import java.util.HashSet;

public class StudentRollNumberHashSet {

    public static void main(String[] args) {

        HashSet<Integer> rollNumbers = new HashSet<>();

        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(101); 
        rollNumbers.add(104);
        rollNumbers.add(102); 

        System.out.println("Final Roll Numbers:");
        System.out.println(rollNumbers);
    }
}