/*
 * 
 * References for Assignment 3 (Class: 1231_18296)
 */

import java.util.Scanner;
import static java.lang.System.exit;

public class Accounts {

        public static void main(String[]args)
        {
            final double checkingAccount = 0.015; //1.5%
            final double savingsAccount = 0.025; //2.5%

            Scanner input = new Scanner(System.in);
            System.out.printf("%-34s","Enter the account type: ");
            int account = input.nextInt();
            System.out.printf("%-34s","Enter the initial balance: ");
            double balance = input.nextDouble();
            double rate = 0.0;

            if (account == 2){
                rate  = savingsAccount;
            }
            else if (account == 1){
                rate  = checkingAccount;
            }
            else {
                System.out.println("Error! Invalid account type. Must be 1, 2 or 3");
                exit(0);
            }

            double newBalance = balance + balance * rate;

            System.out.printf("===================================\n");
            System.out.printf("Init. balance " + " Change " + " New Balance \n");
            System.out.printf("===================================\n");
            System.out.printf("%.2f \t%.2f\t %.2f\n", balance, newBalance-balance, newBalance);

        }
    }


