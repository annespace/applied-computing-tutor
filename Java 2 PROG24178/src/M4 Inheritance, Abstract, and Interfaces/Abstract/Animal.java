/** 
* 
* @author Anne Cho
*/

public abstract class Animal {

     protected String name;

     //abstract methods force children to override it 
     public abstract void speak();

     public void sleep(){
          System.out.println("zzz...");
     }
     
}
