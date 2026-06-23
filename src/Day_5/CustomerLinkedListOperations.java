package Day_5;

import java.util.LinkedList;

public class CustomerLinkedListOperations {

    public static void main(String[] args) {

        LinkedList<String> customers = new LinkedList<>();
        customers.add("Dinesh");
        customers.add("Arun");
        customers.add("Kavin");
        customers.add("Priya");
        customers.add("Nisha");

        System.out.println("Initial Customer List:");
        System.out.println(customers);

        customers.addFirst("Rahul");
        System.out.println("\nAfter Adding Customer at First Position:");
        System.out.println(customers);

        customers.addLast("Vijay");
        System.out.println("\nAfter Adding Customer at Last Position:");
        System.out.println(customers);

         System.out.println("\nFirst Customer: " + customers.getFirst());

         System.out.println("Last Customer: "+ customers.getLast());

         customers.removeFirst();
        System.out.println("\nAfter Removing First Customer:");
        System.out.println(customers);

        customers.removeLast();
        System.out.println("\nAfter Removing Last Customer:");
        System.out.println(customers);

        System.out.println("\nDoes Priya Exist? "+ customers.contains("Priya"));

        System.out.println("Total Customers: " + customers.size());

        System.out.println("\nCustomer List:");
        for (String customer : customers) {
            System.out.println(customer);
        }
    }
}