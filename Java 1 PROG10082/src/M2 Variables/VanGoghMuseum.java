/** 
* 
* https://www.vangoghmuseum.nl/en
* @author Anne Cho 
*/

import java.util.Scanner;

public class VanGoghMuseum { 
	
	public static void main (String[] args) { 

	
		// € Ticket Prices
		double adults = 20; 
		double students = 10; 
		double agedUnder18 = 0; 

		// The number of people in a group
		int numAdults;
		int numStudents;
		int numAgedUnder18;

		// Instantiate a Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome! Discover the Life and Work of Vincent van Gogh 🔆");
		
		// Assign the number of adults
		System.out.println("Enter the number of adults");
		numAdults = input.nextInt();

		// Assign the number of students
		System.out.println("Enter the number of students");
		numStudents = input.nextInt();

		// Assign the number of visitors aged under 18
		System.out.println("Enter the number of visitors aged under 18");
		numAgedUnder18 = input.nextInt();

		double total = 
		(adults * numAdults) + (students * numStudents) + (agedUnder18 + numAgedUnder18);
		System.out.println("The total price will be €" + total);

     }
}