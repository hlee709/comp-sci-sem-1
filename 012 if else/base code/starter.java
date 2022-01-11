import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	Random rand = new Random();
	int rand_num1 = rand.nextInt(1000)+1;
	
	System.out.print("Please guess a number from 1-1000: ");
	int num = sc.nextInt();
	
	if(num == rand_num1){
		System.out.println("You guessed the number right :D!");
	}
	else {
		System.out.println("You guessed the number wrong ):");
	}
	
	
	
	
	
	}
}
