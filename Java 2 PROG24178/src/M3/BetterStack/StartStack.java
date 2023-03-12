/** 
* 
* @author Anne Cho
*/

import java.util.ArrayList;

public class StartStack {

     public static void main(String[] args) throws Exception{
          
          BetterStack stack = new BetterStack();
          stack.push(new Player("Sonny", Nationality.KOREA));
          stack.push(new Player("Neymar", Nationality.BRAZIL));
          stack.push(new Player("Mbappe", Nationality.FRANCE));

          System.out.println(stack.pop().getName());
          System.out.println(stack.peek().getName());
          System.out.println(stack.size());
     }
     
}