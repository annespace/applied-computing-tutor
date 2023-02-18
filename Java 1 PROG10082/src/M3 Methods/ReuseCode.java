/** 
* 
* 
* @author Anne Cho 
*/

public class ReuseCode {

     public static void main (String[] args) { 

		double height = 4; 
		double base = 20; 

		printTriangleArea(height, base); 
          printTriangleArea(20, 5); 
		printTriangleArea(30, 10); 
          printTriangleArea(120, 300); 

	}
	 
	public static void printTriangleArea(double height, double base) { 
          
          double area = .5 * base * height; 
		System.out.println("The area of the triangle is " + area); 
	} 
     
}
