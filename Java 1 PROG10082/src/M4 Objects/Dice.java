/*
 * 
 * References for In-Class Exercise 1
 */

import java.util.Random; 

public class Dice {
 
	public int roll() { 
	Random rnd = new Random(); 
	return rnd.nextInt(5) + 1; 
	} 
	
}