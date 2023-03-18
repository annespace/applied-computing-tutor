/** 
* 
* @author Anne Cho
*/

public class Dress extends Clothing {

     public Dress(String name, String label){
          super(name, 2023, label);
     }

     @Override
     public void description(){
          System.out.println("I love your dress😉");
     }
     
}
