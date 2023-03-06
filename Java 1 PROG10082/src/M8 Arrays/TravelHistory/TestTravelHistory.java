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

      TravelHistory ex = new TravelHistory(3);
      ex.addLocation("Seoul");
      ex.addLocation("London");
      ex.addLocation("Budapest");
      ex.addLocation("Tokyo");
      ex.printLocation();

   }
}