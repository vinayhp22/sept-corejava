//Write a program to check a voter is eligible to vote or not in India based on age
import java.util.Scanner;

class VoterEligibilityCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to voter eligibilty check portal!!!");
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		if(age>=18){
			System.out.println("You are eligible for vote");
		} else {
			System.out.println("You are not eligible for vote");
		}
	}
}
Output:
	Welcome to voter eligibilty check portal!!!
	Enter your age :
	18
	You are eligible for vote
	
	Welcome to voter eligibilty check portal!!!
	Enter your age :
	17
	You are not eligible for vote
	
//Task:
//1. Write a program to check a student result based on marks. Criteria: 35 is the passing marks
//2. Write a program to check grade of student.
		//Criteria: A grade = > A grade so topper
					//B grade => B is lesser than A
					//C grade => C is lesser than both A & B
