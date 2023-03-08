/*
 * 
 * References for Assignment 3 (Class: 1231_18296)
 * @Aidan
 */

import java.util.Scanner;

public class Accounts2 {

     final static double CHECKING_ACCOUNT_INTEREST_RATE = 0.015;
     final static double SAVINGS_ACCOUNT_INTEREST_RATE = 0.025;
     
     public static void main(String[] args) {
 
     Scanner input = new Scanner(System.in);
     System.out.print("Enter account type: ");
     int accountType = input.nextInt();
     System.out.print("Enter initial balance: ");
     double accountBalance = input.nextDouble();

     String account = "";
     double interestRate = 0;
     double newBalance = 0;
     switch (accountType) {
        case 1:
        interestRate = CHECKING_ACCOUNT_INTEREST_RATE;
          break;
        case 2:
        interestRate = SAVINGS_ACCOUNT_INTEREST_RATE;
          break;
        case 3:
          break;
         default:
     account = "Error! Invalid account type. Must be 1, 2 or 3";
     }
     account = "Init. Balance  Change  New Balance";
     newBalance = accountBalance + accountBalance * interestRate;
     System.out.println(account);

     System.out.printf("%6.3f", accountBalance);
     System.out.printf("%14.3f", interestRate);
     System.out.printf("%20.3f", newBalance);
     System.out.println("");

     }
}
     

