import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Please choose to be a Wizard, Warrior, or a Rogue: ");
	String role = sc.nextLine();
	
	if(role.equals("Wizard") || role.equals("wizard")) {
		System.out.println("You are a Wizard :D");
	} else if(role.equals("Warrior") || role.equals("warrior")) {
		System.out.println("Your are a Warrior :D");
	} else if(role.equals("Rogue") || role.equals("rogue")) {
		System.out.println("You are a Rogue :D");
	} else {
		System.out.println("Please enter the right role >:(");
	}

}
}
