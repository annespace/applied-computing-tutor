public class If
{
    public static void main (String[] args)
    {
        int num1 = 15;
        int num2 = 5;

        if (num1 == 15) {
            System.out.println("1st statememt");
            if (num1 + num2 == 20) {
                System.out.println("2nd statememt");
            }
            else {
                System.out.println("3rd statememt");
            }
        }
        else if (num1 != 20) {
            System.out.println("4th statememt");
        }
    }
}