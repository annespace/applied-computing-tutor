/** 
* 
* @author Anne Cho
*/

public class Dog implements IDay, INight{

     @Override
     public void eat(String food){
          System.out.println("smashing " + food);
     }

     @Override
     public void walk(){
          System.out.println("running around the river");
     }

     @Override
     public void sleep(){
          System.out.println(" (barking) ");
     }
     
}
