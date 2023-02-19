/** 
* 
* @author Anne Cho
*/

public class Transcript {

     private double studentAverage = 75.8;

     public String calculate(double marks){

          String text ="";
          if (marks - studentAverage >= 10) {
               text += "You've got high marks!";
          }
          else if (Math.abs(marks-studentAverage) < 10) {
               text += "You're okay!";
          }
          else {
               text += "Don't give up, keep going!";
          }
          return text;
     }
     
}