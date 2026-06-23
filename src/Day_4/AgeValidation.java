package Day_4;

import java.util.Scanner;

class InvalidAge extends Exception {
	InvalidAge(String message) {
        super(message);
    }
}

public class AgeValidation {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new InvalidAge("Age should be 18 and above");
            }

            System.out.println("Eligible for registration");
        }
        catch (InvalidAge e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}