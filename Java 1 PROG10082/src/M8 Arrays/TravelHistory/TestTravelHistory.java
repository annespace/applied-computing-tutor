/** 
* 
* @author Anne Cho
*/

public class TestTravelHistory
{
   public static void main (String[] args) throws Exception{
   
      TravelHistory anne = new TravelHistory(5);
      anne.addLocation("Seoul");
      anne.addLocation("London");
      anne.addLocation("Budapest");
      anne.addLocation("Tokyo");
      anne.addLocation("TaiPei");
      anne.printLocation();

      TravelHistory minWoo = new TravelHistory(3);
      minWoo.addLocation("Seoul");
      minWoo.addLocation("London");
      minWoo.addLocation("Budapest");
      minWoo.addLocation("Tokyo");
      minWoo.printLocation();

   }
}