public class TestYoga {

     public static void main(String[] args) {

          Yoga member1 = new Yoga("Anne","Cho",56789);
          Yoga member2 = new Yoga("Anne","Cho",56789);
          System.out.println(member1);
          System.out.println(member2);
          if(member1.equals(member2)){
               System.out.println("These are the same member");
          }
          else{
               System.out.println("These are different members");
          }
          /* Use the == when you're comparing primitive data types and Strings
          * When we are comparing objects, write a .equals
          */
     }
     
}