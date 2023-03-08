/*
 * 
 * References for Assignment 3 (Class: 1231_18296)
 * @Jean-Luc
 */

 import java.util.Scanner;
import static java.lang.System.exit;
public class Accounts{
    public static final double CHANGE_ONE = 0.015;
    public static final double CHANGE_TWO = 0.025;
        public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        double rate = 0;
        double newBalance = 0;
        double shares = 0;
        double balance = 0;
        System.out.printf("%-34s","Enter the account type: ");
        int account = input.nextInt();
            if(account == 3 || account == 2 || account == 1){
            System.out.printf("%-34s","Enter the initial balance: ");
            balance = input.nextDouble();
            if (account == 3){
            System.out.printf("%-34s","Enter initial stock price:");
            double stock = input.nextDouble();
            System.out.printf("%-34s","Enter actual stock price:");
            double actual = input.nextDouble();
            shares = balance / stock;
            newBalance = shares * actual;
            rate = newBalance - balance;
            }
            else if (account == 2){
            rate = balance * CHANGE_TWO;
            newBalance = balance + rate;
            }
            else if (account == 1){
            rate = balance * CHANGE_ONE;
            newBalance = balance + rate;
            }
            else {
            }
            }
        else {
        System.out.println("Error! Invalid account type. Must be 1, 2 or 3");
        System.exit(0);
        }
    
    System.out.printf("===================================\n");
    System.out.printf("Init. balance " + " Change " + " New Balance \n");
    System.out.printf("===================================\n");
    System.out.printf("\t%.2f \t %.2f \t %.2f\n", balance, rate, newBalance);
    }
}