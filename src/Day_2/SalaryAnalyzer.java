package Day_2;

import java.util.Scanner;

public class SalaryAnalyzer {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);

         System.out.print("Enter number of employees: ");
         int n = sc.nextInt();

         int[] arr = new int[n];

         System.out.println("Enter salaries:");
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }

         int max = arr[0];
         int min = arr[0];
         int sum = 0;
         int cnt = 0;

         for (int i = 0; i < n; i++) {
             if (arr[i] > max) {
                 max = arr[i];
             }

             if (arr[i] < min) {
                 min = arr[i];
             }

             sum += arr[i];
         }

         double avg = (double) sum / n;

         System.out.println("Highest Salary: " + max);
         System.out.println("Lowest Salary: " + min);
         System.out.println("Average Salary: " + avg);

         for (int i = 0; i < n; i++) {
             if (arr[i] > avg) {
                 cnt++;
             }
         }

         System.out.println("No. of people earning more than Average Salary: " + cnt);

         sc.close();
    }
}