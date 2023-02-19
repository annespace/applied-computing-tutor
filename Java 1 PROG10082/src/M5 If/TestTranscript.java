/** 
* 
* @author Anne Cho
*/

import java.util.Scanner;

public class TestTranscript {

     public static void main(String[] args) {

          Scanner input = new Scanner(System.in);
          Transcript anne = new Transcript();

          System.out.print("Enter the marks you've got: ");
          System.out.println(anne.calculate(input.nextDouble()));
     }
     
}
