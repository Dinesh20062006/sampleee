package Day_5;

import java.util.LinkedList;

public class ProductLinkedList {

    public static void main(String[] args) {

        LinkedList<String> products = new LinkedList<>();
        products.add("Laptop");
        products.add("Mobile");
        products.add("Keyboard");
        products.add("Mouse");
        products.add("Printer");

        System.out.println("Initial Product List:");
        System.out.println(products);

        products.addFirst("Monitor");
        System.out.println("\nAfter Adding Product at Beginning:");
        System.out.println(products);

        products.addLast("Scanner");
        System.out.println("\nAfter Adding Product at End:");
        System.out.println(products);

        products.removeFirst();
        System.out.println("\nAfter Removing First Product:");
        System.out.println(products);

        products.removeLast();
        System.out.println("\nAfter Removing Last Product:");
        System.out.println(products);

        System.out.println("\nFinal Product List:");
        for (String product : products) {
            System.out.println(product);
        }
    }
}