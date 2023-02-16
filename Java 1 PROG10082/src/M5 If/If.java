public class If
{
    public static void main (String[] args)
    {
        int num1 = 15;
        int num2 = 5;

        if (num1 == 15) {
            System.out.println("Yikes");
            if (num1 + num2 == 20) {
                System.out.println("Egad");
            }
            else {
                System.out.println("Zoinks");
            }
        }
        else if (num1 != 20) {
            System.out.println("Yowzers");
        }
    }
}