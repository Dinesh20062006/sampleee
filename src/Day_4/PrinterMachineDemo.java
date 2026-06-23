package Day_4;

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class PrinterMachine implements Printable, Scannable {

    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}

public class PrinterMachineDemo {

    public static void main(String[] args) {

        PrinterMachine pm = new PrinterMachine();

        pm.print();
        pm.scan();
    }
}