import java.util.Scanner;

class VoterEligibilityCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to voter eligibilty check portal!!!");
		System.out.println("Enter your age");
		int age = sc.nextInt();
		if(age>18){
			System.out.println("You are eligible for vote");
		} else {
			System.out.println("You are not eligible for vote");
		}
	}
}
		