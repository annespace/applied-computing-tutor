/*
 * 
 * References for Assignment
 */

import java.util.Scanner;

public class ArrayPractice2 {

     public static void main(String[] args) {

          // 0. Create an array of String with 5 elements:
          String[] words = new String[5];

          // 1. Populate the array by using a loop and asking a user to type in words:
          Scanner input = new Scanner(System.in);
          System.out.println("Please type 5 words: ");
          for(int index = 0 ; index < words.length ; index++){
               words[index] = input.nextLine();
          }
    
          // 2. Print this out frontwards:
          System.out.println("You've typed...");
          for(int index = 0 ; index < words.length ; index++){
               System.out.print(words[index] + ", ");
          }
    
          // 3. Use another loop to print the words out backwards:
          System.out.println("\nYou've typed... (backwards)");
          for(int index = words.length - 1 ; index >= 0 ; index--){
               System.out.print(words[index] + ", ");
          }
          System.out.println("");
    
          /*  4. Print out how many of the words are doggy:
          *  Remember to use .equals instead of == when comparing Strings! 
          */
          int howmany = 0;
          for(int index = 0 ; index < words.length ; index++){
               if(words[index].equals("doggy")){
                    howmany++;
               }
          }
          System.out.println(howmany + " word(s) are doggy");
     
     
}

}