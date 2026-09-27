import java.util.Scanner;

// Must add Javadoc here. See lab 2 for reference.

public class Project1
{
	public static void main(String[] args)
	{
		String fullName;
		int posOfSpace;
		String firstName;
		String lastName;
		int firstNameLength;
		int lastNameLength;
		int fullNameLength;
		char firstInitial;
		char lastInitial;
		double midterm;
		double finalExam;
		double average;
		
		// set up the Scanner object for reading user input
		Scanner scanner = new Scanner(System.in);
		
		// ask the user for their full name
		System.out.println("Please enter your first name, followed by a space, followed by your last name:"); 
		fullName = scanner.nextLine();  

		System.out.println("Please enter your midterm grade:"); 
		midterm = scanner.nextDouble();

		System.out.println("Please enter your final exam grade:"); 
		finalExam = scanner.nextDouble();

		posOfSpace = fullName.indexOf(" ");
		
		firstName = fullName.substring(1, posOfSpace - 1);
		lastName = fullName.substring(5);
		
		System.out.println("Name: " + firstName + ", " + lastName + "\n");
		
		firstNameLength = lastName.length();
		lastNameLength = lastName.length();
		fullNameLength = fullName.length();
		
		System.out.println("There are 4 letters in my first name " + firstNameLength);
		System.out.println("There are " + lastNameLength + " letters in my last name");
		System.out.println("There are 11 letters in my full name\n");
		
		firstInitial = fullName.charAt(0);
		lastInitial = fullName.charAt(firstNameLength - 1);
		
		System.out.println("Last initial: " + lastInitial + "\n");
		
		average = midterm + finalExam / 2;
		
		System.out.println("Midterm: " + midterm);
		System.out.println("Final Exam: " + midterm);
		System.out.println("\nAverage: " + average);
		
		scanner.close();
	}
}
