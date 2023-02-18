/** 
* 
* @author Rich Smith
*/

public class Calculator {

     public double answer;
 
     public void add (double number){
         answer += number;
     }
 
     public void subtract (double number){
         this.answer = this.answer - number;
     }
 
     public void multiply (double number){
         this.answer = this.answer * number;
     }
 
     public void divide(double number){
         answer /= number;
     }
 
     public void clear(){
         answer = 0;
     }
 
     public double getAnswer(){
         return this.answer;
     }
 
 }