import java.util.Scanner; 

public class TaxCalculator { 

	public static void main(String[] arg) { 
	
		double beforeTaxPrice; 
		final double ONTARIO_TAX_RATE = 1.13; 
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Before tax price: "); 
		beforeTaxPrice = input.nextDouble(); 
		double afterTaxPrice = beforeTaxPrice * ONTARIO_TAX_RATE; 
		System.out.println("After tax price: " + afterTaxPrice); 
	} 
}