package Day_2;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the resume summary");
        String summary = sc.nextLine();
        String[] words = summary.split(" ");
        System.out.println("Word Count: " + words.length);
        sc.close();
	}

}
