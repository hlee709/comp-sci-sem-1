import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	int secretnum = rand.nextInt(1000) + 1;
	int guess = 0;
	
	while(guess == 0) {
		System.out.print("Please input a number between 1-1000: ");
		int guessnum = sc.nextInt();
		
		if(guessnum > 1000 || guessnum < 1) {
			System.out.println("Invalid. Try inputting a number between 1-1000: ");
		}
		else if(guessnum != secretnum) {
			System.out.println("Try again!");
		}
		else if(guessnum == secretnum) {
			System.out.print("Congrats. You guessed the right number!");
			break;
		}
	
	}
	
	


		
	}
}
