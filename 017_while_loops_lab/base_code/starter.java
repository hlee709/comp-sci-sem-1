import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	
	System.out.print("What is your name: ");
	String name = sc.nextLine();
	
	System.out.print("Enter a Number: ");
	int num = sc.nextInt();
	
	int c = 0;
	while(true) {
		System.out.println(name);
		if(c == num) {
		break;
		}
		c = c + 1;
	}



		
	}
}
