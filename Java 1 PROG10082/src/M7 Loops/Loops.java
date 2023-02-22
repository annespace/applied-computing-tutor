/** 
* 
* @author Anne Cho
*/

public class Loops {

     public void whileLoop(int to){
          System.out.println("WHILE LOOP");
          int from = 0;
          while(from<=to){
               System.out.print(from + ", ");
               from++;
          }         
     }

     public void forLoop(int to){
          System.out.println("\nFOR LOOP");
          for(int from = 0; from <=to; from++){
               System.out.print(from + ", ");
          }
     }

     public void doWhileLoop (int to){
          System.out.println("\nDO WHILE LOOP");
          int from = 0;
          do {
          System.out.print(from + ", ");
          from++;
          }
          while (from <= to);
     }


}
     
