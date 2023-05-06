package basics;
import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {

		    Scanner scanner = new Scanner(System.in);
		    int num;

		    do {
		      System.out.print("Enter a number between 1 and 10: ");
		      num = scanner.nextInt();
		    } while (num < 1 || num > 10);

		    System.out.println("The number you entered is: " + num);
		    
   
	}
}
