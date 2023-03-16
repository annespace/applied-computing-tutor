/** 
* 
* @author Anne Cho
*/

public class StartPet {

     public static void main(String[] args) {

          Pet p1 = new Pet("pet");
          p1.sleep();
          p1.speak();
          System.out.println("");

          Doggy d1 = new Doggy("miss.dog");
          // d1.setName("miss.dog");
          d1.speak();
          d1.sleep();
          System.out.println("");

          Froggy f1 = new Froggy("mr.frog");
          // f1.setName ("mr.frog");
          f1.sleep();
          f1.speak();
          f1.jump();
                    
     }
     
}
