package Day_2;

import java.util.Scanner;

public class MoveZeros {
	 public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);

         System.out.print("Enter number of employees: ");
         int n = sc.nextInt();

         int[] arr = new int[n];

         System.out.println("Enter salaries:");
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }
         
         int j=0;
         int temp[]=new int[n];
         for(int i=0;i<n;i++)
         {
        	 if(arr[i]==0)
        	 {
                continue;
        	 }
        	 else
        	 {
        		 temp[j]=arr[i];
        		 j++;
        	 }
         }
         for(int i=j;i<n;i++)
         {
        	 temp[i]=0;
         }
         System.out.println("The Array after moving zeros the ens is:\n ");
         for(int i=0;i<n;i++)
         {
        	 System.out.println(temp[i]);
         }

         
         sc.close();
	 }
}
