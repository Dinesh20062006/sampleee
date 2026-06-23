package Day_5;

import java.util.TreeSet;

public class MarksTreeSetOperations {

    public static void main(String[] args) {
        TreeSet<Integer> marks = new TreeSet<>();

        marks.add(85);
        marks.add(70);
        marks.add(95);
        marks.add(60);
        marks.add(80);
        marks.add(90);
        marks.add(75);

        System.out.println("Marks in Sorted Order:");
        System.out.println(marks);
        
        System.out.println("\nMarks in Descending Order:");
        System.out.println(marks.descendingSet());

        System.out.println("\nFirst Mark: " + marks.first());

        System.out.println("Last Mark: " + marks.last());

        System.out.println("\nDoes 80 Exist? " + marks.contains(80));

        System.out.println("\nMarks Less Than 80:");
        System.out.println(marks.headSet(80));

        System.out.println("\nMarks Greater Than or Equal To 80:");
        System.out.println(marks.tailSet(80));

        System.out.println("\nHigher Than 80: " + marks.higher(80));

        System.out.println("Lower Than 80: " + marks.lower(80));
        
        marks.remove(70);
        System.out.println("\nAfter Removing 70:");
        System.out.println(marks);

        System.out.println("\nTotal Number of Marks: " + marks.size());
    }
}