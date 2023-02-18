/** 
* 
* @author Anne Cho
*/

public class ShortIf
{
    public static void main (String[] args)
    {
        String variable1 = "anne";
        String variable2 = "Anne";
        String result = "";
        
        result = (variable1 == variable2) ? "these are the same word" : "these are NOT the same word";

        System.out.println(result);
    }
}