public class ShortIf
{
    public static void main (String[] args)
    {
        int num1 = 5;
        int num2 = 10;
        String var1 = "";
        
        var1 = (num1 < num2) ? "num 1 is less than num2" : "num1 is NOT less than num2";

        System.out.println(var1);
    }
}