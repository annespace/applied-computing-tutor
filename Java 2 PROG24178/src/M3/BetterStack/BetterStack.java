/** 
* 
* @author Anne Cho
*/

import java.util.ArrayList;

public class BetterStack {

     //Stack - to -> ArrayList

     private ArrayList<Player> playerStack = new ArrayList<Player>();

     public void push (Player player) throws Exception{
          this.playerStack.add(player);
   
     }

     public Player pop() throws Exception {
          if(playerStack.isEmpty()) {
               throw new Exception("Stack is empty");
          }
          return this.playerStack.remove(this.playerStack.size()-1);
     }

     public int size(){
          return playerStack.size();
     }

     public Player peek() throws Exception {
          if(playerStack.isEmpty()) {
               throw new Exception("Stack is empty");
          }
          return this.playerStack.get(this.size()-1);
     }


}
