/** 
* 
* @author Anne Cho
*/

public class Cat implements IDay, INight {

     @Override
     public void eat(String food){
          System.out.println("playing with " + food);
     }

     @Override
     public void walk(){
          System.out.println("walking around the room");
     }

     @Override
     public void sleep(){
          System.out.println(" (meow) ");
     }
     
}
