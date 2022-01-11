import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	//take in one integer as input accomplish the following output
	//ex. input 6 - 6, 7, 8, 9, 10 | input 31 - 31, 32, 33, 34, 35
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter an integer:");
	int num = sc.nextInt();
	
	int count = 0;
	while(true) {
		System.out.println(num += 1);
		
		if(count == 5) {
			break;
		}
		count = count + 1;
	}
	
	
	
	
	
	
	
	
	
	

	}
}
