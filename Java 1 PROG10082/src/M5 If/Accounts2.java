/*
 * 
 * References for Assignment 3 (Class: 1231_18296)
 * @Aidan B.
 */

import java.util.Scanner;

public class Accounts2 {

     final static double CHECKING_ACCOUNT_INTEREST_RATE = 15;
     final static double SAVINGS_ACCOUNT_INTEREST_RATE = 25;
     
     public static void main(String[] args) {
 
     Scanner input = new Scanner(System.in);
     System.out.print("Enter account type: ");
     int accountType = input.nextInt();
     if (accountType!=3 && accountType!=2 && accountType!=1 ){
          System.out.println("Error! Invalid account type. Must be 1, 2 or 3");
          System.exit(0);
     }
     System.out.print("Enter initial balance: ");
     double accountBalance = input.nextDouble();

     String account = "";
     double interestRate = 0;
     double newBalance = 0;

     double shares=0;
     double stock = 0;
     double actual = 0;

     

     switch (accountType) {
        case 1:
        interestRate = CHECKING_ACCOUNT_INTEREST_RATE;
        newBalance = accountBalance + interestRate;
          break;
        case 2:
        interestRate = SAVINGS_ACCOUNT_INTEREST_RATE;
        newBalance = accountBalance + accountBalance * interestRate;
          break;
        case 3:
        System.out.printf("%-34s","Enter initial stock price:");
        stock = input.nextDouble();
        System.out.printf("%-34s","Enter actual stock price:");
        actual = input.nextDouble();
        shares = accountBalance / stock;
        newBalance = shares * actual;
        interestRate = newBalance - accountBalance;
          break;
         default:
     account = "Error! Invalid account type. Must be 1, 2 or 3";
     }
     account = "Init. Balance  Change  New Balance";
     System.out.println(account);

     System.out.printf("%6.2f", accountBalance);
     System.out.printf("%14.2f", interestRate);
     System.out.printf("%20.2f", newBalance);
     System.out.println("");

     }
}
     

