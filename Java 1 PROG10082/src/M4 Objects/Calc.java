public class Calc {
     public static void main (String[] args)
    {
        Calculator calc = new Calculator();
        calc.add(10);
        calc.add(5);
        calc.add(10);
        System.out.println(calc.getAnswer());
        calc.divide(5);
        System.out.println(calc.getAnswer());
        calc.clear();
        System.out.println(calc.getAnswer());
        calc.add(100);
        System.out.println(calc.getAnswer());
    }
}
