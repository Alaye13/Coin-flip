package coinflip;
/**
 * Ifenna Ekwenem
 * Simple Java coin toss
 */
import java.util.Scanner;
public class Coinflip {
	 public static void main(String[] args) {
		 try (/**
				  * Receiving Scanner Input from User
				  */
		Scanner scanner = new Scanner(System.in)) {
			System.out.println("How many times are you tossing: ");
			int numberofFlips = scanner.nextInt();

			int numberofHeads = 0;
			int numberofTails = 0;

			/**
			 * Iteration for multiple coin toss
			 * With display message for console
			 */
			for (int i = 0; i < numberofFlips; i++) {
			  double coin = Math.random();
			  if (coin < 0.5) {
			    numberofHeads++;
			    System.out.println("It is Heads");
			  } else {
			    numberofTails++;
			    System.out.println("It is Tails");
			  }
			}

			System.out.println("Total Number of heads tossed: " + numberofHeads);
			System.out.println("Total Number of tails tossed: " + numberofTails);
		}
	  }
	}



