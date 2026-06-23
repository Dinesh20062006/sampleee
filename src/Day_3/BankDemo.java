package Day_3;

abstract class BankAccount {

    abstract void calculateInterest();
    void displayBankName() {
        System.out.println("Bank Name: State Bank of India");
    }
}

class SavingsAccount extends BankAccount {
    void calculateInterest() {
        System.out.println("Savings Account Interest: 4%");
    }
}

class CurrentAccount extends BankAccount {
    void calculateInterest() {
        System.out.println("Current Account Interest: 0%");
    }
}

public class BankDemo {

    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount();
        sa.displayBankName();
        sa.calculateInterest();

        System.out.println();

        CurrentAccount ca = new CurrentAccount();
        ca.displayBankName();
        ca.calculateInterest();
    }
}