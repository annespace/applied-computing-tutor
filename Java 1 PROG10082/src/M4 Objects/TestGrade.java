/** 
* 
* @author Anne Cho
*/

import java.util.Scanner;

public class TestGrade { 

	public static void main(String[] args){ 

		// Explain the difference between Scanner class and Grade class?
		Scanner input = new Scanner(System.in);
		Grade student1 = new Grade(); 

		student1.name = "Anne"; 

		System.out.println("Enter the java1 marks: ");
		student1.java1 = input.nextInt(); 

		System.out.println("Enter the data networking marks: ");
		student1.dataNetworking = input.nextInt(); 

		System.out.println("Enter the math marks: ");
		student1.math = input.nextInt(); 

		System.out.println("Enter the web development marks: ");
		student1.webDevelopment = input.nextInt(); 
		
		System.out.println(student1.getAve()); 
		System.out.println(student1.transcript()); 
	} 
}