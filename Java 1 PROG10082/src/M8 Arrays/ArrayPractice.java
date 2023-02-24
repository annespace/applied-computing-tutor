/*
 * 
 * References for Assignment
 */

import java.util.Random;

public class ArrayPractice {
     
         public static void main(String[] args) {

      // 1. Build an array that can hold 10 int values
             int[] numbers = new int[10];

          // 2. Use a loop to add a random number from 1-100 inclusive to each element of the array
             Random rnd = new Random();
             for (int floor = 0; floor < numbers.length; floor++) {
                 numbers[floor] = rnd.nextInt(100) + 1;
             }
     
             System.out.println("");
               // 3. Find the largest number in the array
             int largest = 0;
             for(int i = 0; i < numbers.length; i++) {
                 if (numbers[i] > largest) {
                     largest = numbers[i];
                 }
             }
             System.out.println("The largest number is: " + largest);

              // 4. Tell me how many numbers are greater than 50 
             int numsGreaterThanFifty = 0;
             for(int i = 0; i < numbers.length; i++) {
                 if (numbers[i] > 50) {
                     numsGreaterThanFifty++;
                 }
             }
             System.out.println("The number of numbers greater than 50: " + numsGreaterThanFifty);
         }
     }
