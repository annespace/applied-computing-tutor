public class MethodOverloading
{
    public static void main(String[] args) {
        Overloading ave = new Overloading();
        System.out.println(ave.getAve(5));
        System.out.println(ave.getAve(5,7));
        System.out.println(ave.getAve(5,7,9));
        System.out.println(ave.getAve(5.0,7,9));
    }
}
//https://www.javatpoint.com/method-overloading-in-java