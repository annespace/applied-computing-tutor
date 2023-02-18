/** 
* 
* @author Anne Cho
*/

public class If
{
    public static void main (String[] args)
    {
        int variable1 = 16;
        int variable2 = 5;

        if (variable1 > 15) {
            System.out.println("1st statememt");
            if (variable2 != 20) {
                System.out.println("2nd statememt");
            }
            else {
                System.out.println("3rd statememt");
            }
        }
        else if (variable1 == 15) {
            System.out.println("4th statememt");
        }
        else {
          System.out.println("5th statememt");
        }
    }
}