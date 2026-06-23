package Day_2;

import java.util.Scanner;

public class StudentMark {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         int [][] stu=new int[3][4];
         System.out.println("Enter each student marks");
         for(int i=0;i<stu.length;i++)
         {
        	 for(int j=0;j<stu[i].length;j++)
        	 {
        		 stu[i][j]=sc.nextInt();
        	 }
         }
         int max=0;
         for(int i=0;i<stu.length;i++)
         {
        	 int sum=0;
        	 for(int j=0;j<stu[i].length;j++)
        	 {
        		 sum=sum+stu[i][j];
        	 }
        	 System.out.println("Total mark of student "+ (i+1) +" is : " + sum);
        	 System.out.println("Average mark of student "+ i +" is : " + sum/4);
        	 max=Math.max(max, sum);
         }
    	 System.out.println("Topper student mark is " + max);
    	 

		 
		 sc.close();
	}

}
