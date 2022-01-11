import java.util.Scanner;

class starter {
	
	
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	double num = Math.max(13 - 6 * 11, 30 % 7 *(-2));
	double num1 = Math.sqrt(3 * 8 + 31 % 7);
	double num2 = Math.pow(37 / 3, 35 % 21);
	double num3 = Math.sqrt(2*6);
	double num4 = Math.pow(2,14 % 3);
	
	System.out.println(num);
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);
	System.out.println(num4);
	
	//Extra
	System.out.println("Please put in a number");
	int number1 = sc.nextInt();
	
	System.out.println("Please put in another number");
	int number2 = sc.nextInt();
	//ask teacher why it wont print this out
	System.out.println("The larger number is " + Math.max(number1, number2));
	
	System.out.println("The square root of your second number is " + Math.sqrt(number2));
	System.out.println("Your first number to the power of your second number is " + Math.pow(number1, number2));
	
	
	
	
	
	
	
	

	}
}
