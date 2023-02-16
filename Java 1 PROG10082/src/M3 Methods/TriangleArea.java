public class TriangleArea {
     public static void main (String[] args) { 

          //Methods allow us to reuse code
		double length = 4; 
		double width = 20; 

		printTriangleArea(length, width); 
          printTriangleArea(20, 5); 
		printTriangleArea(30, 10); 
		printTriangleArea(1000, 10000); 
	}
	 
	public static void printTriangleArea(double length, double width) { 
	
		double area = .5 * length * width; 
		System.out.println("The area of the triangle is " + area); 
	} 
     
}
