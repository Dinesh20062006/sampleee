package Day_5;

import java.util.Vector;

public class BankTransactionVector {

    public static void main(String[] args) {

        Vector<String> transactions = new Vector<>();
        transactions.add("TXN1001");
        transactions.add("TXN1002");
        transactions.add("TXN1003");
        transactions.add("TXN1004");
        transactions.add("TXN1005");

        transactions.add("TXN1003");

        System.out.println("Transaction IDs:");
        System.out.println(transactions);

        System.out.println("\nTotal Transactions: " + transactions.size());

        System.out.println("\nDoes TXN1004 exist? "+ transactions.contains("TXN1004"));
    } 
}