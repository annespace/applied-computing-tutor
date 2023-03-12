/** 
* 
* @author Anne Cho
*/

import java.util.ArrayList;

public class LearningArrayList {

     public static void main(String[] args) {
          
          ArrayList<Player> players = new ArrayList<Player>();
          players.add(new Player("Neymar", Nationality.BRAZIL));
          players.add(new Player("Messi", Nationality.ARGENTINA));
          players.add(new Player("Mbappe", Nationality.FRANCE));
          players.add(new Player("Ronaldo", Nationality.PORTUGAL));
          players.add(new Player("Sonny", Nationality.KOREA));
          System.out.println(players.isEmpty());
          System.out.println(players.size());
          System.out.println(players.get(4).getName());
          System.out.println(players.remove(3).getName());
          System.out.println(players.size());
          players.remove(0);
          System.out.println(players.get(0).getName());
     }
     
}
