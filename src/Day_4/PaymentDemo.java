package Day_4;

interface Payment {

    void makePayment(double amount);
}

class UPIPayment implements Payment {

    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " completed using UPI");
    }
}

class CardPayment implements Payment {

    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " completed using Card");
    }
}

public class PaymentDemo {

    public static void main(String[] args) {

        Payment p1 = new UPIPayment();
        p1.makePayment(1500);

        Payment p2 = new CardPayment();
        p2.makePayment(2500);
    }
}