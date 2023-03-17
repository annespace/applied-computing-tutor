/** 
* 
* @author Anne Cho
*/

public class StartAnimal {

     public static void main(String[] args) {

          // Animal a1 = new Animal(); 
          // /* Animal is abstract cannot be instantiated */
          Frog f1 = new Frog();
          f1.sleep();
          f1.speak();
          System.out.println("");
          Dog d1 = new Dog();
          d1.sleep();
          d1.speak();
          System.out.println("");
          JapaneseSpitz js1 = new JapaneseSpitz();
          js1.sleep();
          js1.speak();
     }
     
}
