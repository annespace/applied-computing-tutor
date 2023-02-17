import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Try any numbers.");
        try {
            int age = scan.nextInt(); 
// this is risky code. WHY? we can type String instead of int
// we can take risky code which might throw an exception and surround it with a try.
        }
        catch (Exception err) {
            System.out.println(
"Sorry, our servers are down for routine maintenance");
// we are able to intercept that exception before the program ended and run our own code.
        }
    }
}