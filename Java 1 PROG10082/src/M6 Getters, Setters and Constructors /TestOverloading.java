/** 
* 
* @author Anne Cho
*/

public class TestOverloading
{
    public static void main(String[] args) {
        Overloading numbers1 = new Overloading();
        System.out.println(numbers1.getAve(5));
        System.out.println(numbers1.getAve(5,7));
        System.out.println(numbers1.getAve(5,7,9));
        System.out.println(numbers1.getAve(5.0,7,9));
    }
}
//https://www.javatpoint.com/method-overloading-in-java