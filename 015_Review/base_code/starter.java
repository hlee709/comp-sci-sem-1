import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
	System.out.print("What is your name: ");
	String name = sc.nextLine();
	
	
	System.out.print("Please choose to be a Wizard, Warrior, or a Rogue: ");
	String role = sc.nextLine();
	
	if(role.equals("Wizard") || role.equals("wizard")) {
		System.out.println("You are a Wizard!");
	}
	else if(role.equals("Warrior") || role.equals("warrior")) {
		System.out.println("Your are a Warrior!");
	}
	else if(role.equals("Rogue") || role.equals("rogue")) {
		System.out.println("You are a Rogue!");
	}
	else {
		System.out.println("Please enter the right role!");
	}
	
	int c = 25;
	
	System.out.println("Hey, " + role + "you have 25 points to spend on traits!");
	System.out.print("You can only use 10 points for each trait. How many points do you want Strength to have?: ");
	int trait = sc.nextInt();
	int strength = trait;
	if(trait>10) {
		System.out.println("Please put in a number less than 10.");
	}
	c = c-trait;
	if(c<=0) {
		System.out.println("You have used all your points.");
	}
	System.out.println("You have " + c + " points left!");
	
	
	System.out.println("Hey, " + role + "you have " + c + " points to spend on traits!");
	System.out.print("You can only use 10 points for each trait. How many points do you want Dexterity to have?: ");
	int trait2 = sc.nextInt();
	int dexterity = trait2;
	if(trait2>10) {
		System.out.println("Please put in a number less than 10.");
		
	}
	c = c-trait2;
	if(c<=0) {
		System.out.println("You have used all your points.");
	}
	System.out.println("You have " + c + " points left!");
	
	
	System.out.println("Hey, " + role + "you have " + c + " points to spend on traits!");
	System.out.print("You can only use 10 points for each trait. How many points do you want Intelligence to have?: ");
	int trait3 = sc.nextInt();
	int intelligence = trait3;
	if(trait3>10) {
		System.out.println("Please put in a number less than 10.");
	}
	c = c-trait3;
	if(c<=0) {
		System.out.println("You have used all your points.");
	}
	System.out.println("You have " + c + " points left!");
	
	
	System.out.println("Hey, " + role + "you have " + c + " points to spend on traits!");
	System.out.print("You can only use 10 points for each trait. How many points do you want Constitution to have?: ");
	int trait4 = sc.nextInt();
	int constitution = trait4;
	if(trait4>10) {
		System.out.println("Please put in a number less than 10.");
	}
	c = c-trait4;
	if(c<=0) {
		System.out.println("You have used all your points.");
	}
	System.out.println("You have " + c + " points left!");
	
	
	System.out.println("Hey, " + role + " you have " + c + " points to spend on traits!");
	System.out.print("You can only use 10 points for each trait. How many points do you want Charisma to have?: ");
	int trait5 = sc.nextInt();
	int charisma = trait5;
	if(trait5>10) {
		System.out.println("Please put in a number less than 10.");
	}
	c = c-trait5;
	if(c<=0) {
		System.out.println("You have used all your points.");
	}
	System.out.println("You have " + c + " points left!");

	System.out.println("Hi " + name + " you are a " + role + " Your stats for strength: " + strength + " Your stats for dexterity: " + dexterity + " Your stats for intelligence: " + intelligence + " Your stats for constitution: " + constitution + " Your stats for charisma: " + charisma );


	
	
	
	
}
}
