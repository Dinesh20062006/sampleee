package Day_2;
import java.util.Scanner;
public class MobileNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		String num=sc.next();
        
        if(num.length()>10)
        {
        	System.out.println("Invalid Number");
        }
        
        String res="******";
        
        for(int i=6;i<10;i++)
        {
        	 res = res+num.charAt(i);
        }

        System.out.println("The encrypted number is "+res);
        sc.close();
        
        
	}

}
