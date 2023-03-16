/** 
* 
* @author Anne Cho
*/

public class Pet {

     protected String name;

     public Pet(String name){
          this.name = name;
     }

     public String getName(){
          return this.name;
     }

     public void setName(String name){
          this.name = name;
     }

     public void speak(){
          System.out.println(this.name + ": Hello");
     }

     public void sleep(){
          System.out.println(name + ": zzz...");
     }

}