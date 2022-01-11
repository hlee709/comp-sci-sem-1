import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your First Name: ");
		String FirstName = sc.nextLine();
		
		System.out.println("What is your Age: ");
		int Age = sc.nextInt();
		
		System.out.println("When is your Birthday Month: ");
		int BirthdayMonth = sc.nextInt();
		
		System.out.println("What is your Birthday Date: ");
		int BirthdayDate = sc.nextInt();
		
		System.out.println("What is your Birthday Year: ");
		int BirthdayYear = sc.nextInt();
		
		System.out.println("How much is a buck fifty: ");
		double BuckFifty = sc.nextDouble();
		
		
		System.out.println("Hi " + FirstName + "!"); 
		
		System.out.println("You are " + Age + " years old.");
		
		System.out.println("Your Birthday Month is " + BirthdayMonth + ".");
		
		System.out.println("Your Birthday Date is " + BirthdayDate + ".");
		
		System.out.println("Your Birthday Year is " + BirthdayYear + ".");
		
		System.out.println("A buck fifty is " + BuckFifty + " dollars.");
		
		
		
		
		
		
		

	}
}
