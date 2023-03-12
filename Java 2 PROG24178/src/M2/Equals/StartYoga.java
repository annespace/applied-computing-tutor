/**
 *
 * @author Anne Cho
 */

 public class StartYoga {

     public static void main(String[] args) {
 
         Yoga member1 = new Yoga("Anne","Cho",12345);
         Yoga member2 = new Yoga("Anne","Cho",12345);
         System.out.println(member1);
         System.out.println(member2);
/* Use the == when you're comparing primitive data types (and Strings - not recommended)
* When we are comparing objects, write a .equals
*/
         if(member1.equals(member2)){
             System.out.println("These are the same member");
         }
         else{
             System.out.println("These are different members");
         }
     }
 
 }