/**
 *
 * @author Anne Cho
 */

 public class Yoga {

     private String firstName;
     private String lastName;
     private int memberId;
 
     public Yoga(String firstName, String lastName, int memberId){
         this.firstName = firstName;
         this.lastName = lastName;
         this.memberId = memberId;
     }
 
     public boolean equals(Yoga objt){
         return this.memberId == objt.memberId;
     }
     
 }