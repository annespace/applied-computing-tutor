/*
 * 
 * References for In-Class Exercise 1
 */

import java.util.Random; 

public class DiceStatic { 

	public static void main (String[] args) { 
	
	int sum = 0; 
		for(int i = 0 ; i < 20 ; i++) { 
		
			int number = roll(); 
			System.out.print(number + "+ "); 
			sum += number; 
		} 
	System.out.println(sum);
	} 
	
	// Use a static method
	public static int roll() { 
		Random rnd = new Random(); 
		return rnd.nextInt(5) + 1;
	} 
	
}