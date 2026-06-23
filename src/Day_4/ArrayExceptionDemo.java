package Day_4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ArrayExceptionDemo {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the index: ");
            int index = sc.nextInt();

            System.out.println("Value at index " + index + " = " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Array index is out of range.");
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer value.");
        }

        sc.close();
    }
}