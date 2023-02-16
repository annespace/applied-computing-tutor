import java.util.Random;

public class Guess {

     public int randomNumber;

     public void numberGenerator(){
          Random rnd = new Random();
          randomNumber = rnd.nextInt(10)+1;
     }

     public String makeGuess(int input){
          int value = Math.abs(randomNumber-input);
          String returnMessage = "";
          if(value==0){
               returnMessage += "you've got it!";
          }
          else if(value==1){
               returnMessage += "almost got it!";
          }
          else if(value==2){
               returnMessage += "similar!";
          }
          else if(value==3){
               returnMessage += "..!";
          }
          else {
               returnMessage += "try again!";
          }
          return returnMessage + " the number is " + randomNumber;
     }
  
}
