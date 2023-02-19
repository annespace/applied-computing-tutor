/** 
* 
* @author Anne Cho 
*/

public class Calculator {

     public static int result;

     public static void main(String[] args) {
          add(2);
          minus(1);
          multiply(10);
          divide(5);
     }

     public static void add(double number){
          System.out.println(result += number);
     }

     public static void minus(double number){
          System.out.println(result -= number);
     }

     public static void multiply(double number){
          System.out.println(result *= number);
     }

     public static void divide(double number){
          System.out.println(result /= number);
     }
    
}
