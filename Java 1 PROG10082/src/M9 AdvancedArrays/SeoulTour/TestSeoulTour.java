/** 
* 
* @author Anne Cho
*/

public class TestSeoulTour {

     public static void main(String[] args) throws Exception {

          SeoulTour anne = new SeoulTour(3);
          Tour tour1 = new Tour("Gwanghwamun","[line 5] Gwanghwamun station");
          anne.addTour(tour1);
          anne.addTour(new Tour("Insadong","[line 1]Jonggak station"));
          anne.addTour(new Tour("digital media city", "DMC station"));
          anne.printTour();



     
     }
    
}
