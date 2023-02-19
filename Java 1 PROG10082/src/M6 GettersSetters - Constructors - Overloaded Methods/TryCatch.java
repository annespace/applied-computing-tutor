/** 
* 
* @author Anne Cho
*/

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Your age: ");
        try {
          int age = input.nextInt(); 
/*  This is risky code. WHY? we can type String instead of int
 *  we can take risky code which might throw an exception and surround it with a try.
 */
        }
        catch (Exception err) {
          System.out.println("we can't excute the program 🙈 Illegal input");
// we are able to intercept that exception before the program ended and run our own code.
        }
    }
}