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
        String variable3 = "anne";

        String comp1and2 = "", comp1and3 = "";
        
        comp1and2 = (variable1 == variable2) ? "these are the same word" : "these are NOT the same word";
        comp1and3 = (variable1 == variable3) ? "these are the same word" : "these are NOT the same word";

        System.out.println(comp1and2);
        System.out.println(comp1and3);
    }
}