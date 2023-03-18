/** 
* 
* @author Anne Cho
*/

public class Skirt extends Clothing {

     public Skirt(String name, String label){
          super(name, 2023, label);
     }

     @Override
     public void description(){
          System.out.println("such a beautiful skirt😎");
     }
     
}
