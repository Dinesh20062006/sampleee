package Day_3;

interface Payment {
    void makePayment(double amount);
}

class UPIPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("UPI Payment Successful: Rs." + amount);
    }
}

class CardPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Card Payment Successful: Rs." + amount);
    }
}

public class PaymentDemo {

    public static void main(String[] args) {

        Payment p1 = new UPIPayment();
        Payment p2 = new CardPayment();

        p1.makePayment(1500);
        p2.makePayment(2500);
    }
}