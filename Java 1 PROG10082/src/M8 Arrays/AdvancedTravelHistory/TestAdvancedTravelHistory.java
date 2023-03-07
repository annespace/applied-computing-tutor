/** 
* 
* @author Anne Cho
*/

public class TestAdvancedTravelHistory{

     public static void main(String[] args) throws Exception {

          AdvancedTravelHistory h1 = new AdvancedTravelHistory("Anne","London","England");
          h1.addSpot("Soho");
          h1.addSpot("Tower Bridge");
          h1.addSpot("Westminster Abbey");
          h1.addSpot("Imperial War Museum");
          h1.printHistory();

          AdvancedTravelHistory h2 = new AdvancedTravelHistory("MinWoo","London","England");
          h2.addSpot("Soho");
          h2.addSpot("Tower Bridge");
          h2.addSpot("Westminster Abbey");
          h2.addSpot("Imperial War Museum");
          // h2.addSpot("Shoryu Ramen Liverpool Street");
          h2.printHistory();
     }
}