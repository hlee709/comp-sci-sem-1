import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int multDiv3(int x, int y) {
		int num1 = x;
		int num2 = y;
		int product = num1 * num2;
		if(product % 3 == 0) {
			return "It's divisible by 3";
		}
		else {
			return "It's not divisible by 3";
		}
		
	}
	
	public static void main(String args[]) {
		Scanner sc.new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(mulDiv3(a, b));
	//Create a method that takes in two integers
	//then multiplies them together, then return if the product is divisable by 3
	
	
	

	
	
	

	}
}
