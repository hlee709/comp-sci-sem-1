import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Please enter your first period: ");
	String subjectA = sc.nextLine();
	
	System.out.print("Please enter your second period: ");
	String subjectB = sc.nextLine();
	
	System.out.print("Please enter your third period: ");
	String subjectC = sc.nextLine();
	
	System.out.print("Please enter your " + subjectA + " GPA");
	int gradeA = sc.nextInt();
	
	System.out.print("Please enter your " + subjectB + " GPA");
	int gradeB = sc.nextInt();
	
	System.out.print("Please enter your " + subjectC + " GPA");
	int gradeC = sc.nextInt();
	
	System.out.println("Period 1- " + subjectA + ": " + gradeA);
	System.out.println("Period 2- " + subjectB + ": " + gradeB);
	System.out.println("Period 3- " + subjectC + ": " + gradeC);
	
	System.out.print("Total GPA" + (gradeA + gradeB + gradeC/3.0));
	
	
	
	
	
	
	
	
	

	}
}
