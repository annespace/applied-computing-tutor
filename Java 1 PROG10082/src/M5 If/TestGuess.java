/** 
* 
* @author Rich Smith
*/

import java.util.Scanner;

public class TestGuess {

    public static void main(String[] args){

        Guess g1 = new Guess();
        g1.numberGenerator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number between 1 - 10");
        String result = g1.makeGuess(scanner.nextInt());
        System.out.println(result);
    }
}