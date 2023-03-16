/** 
* 
* @author Anne Cho
*/

public class Doggy extends Pet {

     public Doggy(String name){
          super(name);
     }

     @Override
     public void speak(){
          System.out.println(name + ": Bow Wow");
     }
     


     
}
