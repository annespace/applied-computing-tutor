public class Renovations { 
	
	public static void main (String[] args) { 
	
		//Room dimensions 
		double length = 20; 
		double width = 15; 
		double height = 10; 
	
		//Area of all four walls 
		double totalArea = length * height * 2 + width * height * 2;
		
		//Each can of paint covers 20 square meters 
		double numCansPaint = totalArea / 20; 
	
		//$28.99 per can of paint 
		double costOfPaint = numCansPaint * 28.99; 
		
		//painters can cover 50 square meters per hour
		double hoursLabour = totalArea / 50;  
		
		//$30 labour per hour
		double costOfPaintingLabour = hoursLabour * 30;  
		
		double totalCostToPaint = costOfPaint + costOfPaintingLabour; 
		
		System.out.println(" Painting Costs:"); 
		System.out.println(" The area to be painted is " + totalArea + " square meters"); System.out.println(" Cost of paint: $" + costOfPaint); 
		System.out.println(" Cost of labour to paint: $" + costOfPaintingLabour); System.out.println(" The total cost to paint the room is $" + totalCostToPaint);

     }
}