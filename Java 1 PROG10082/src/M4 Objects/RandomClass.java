/** 
* 
* @author Anne Cho
*/

import java.util.Random; 

public class RandomClass {
    
    /*  what is an Object?… and how is it different from a class?
- An object is an instantiation of a class into the heap memory of the computer
- A class is the set of instructions that the JVM uses to instantiate an object
     */

	public static void main(String[] args){ 
	
		double anne = 5; 
		Random randomAnne = new Random(); 
		//anne = local variable. it’s declared inside of a method
		//randomAnne = reference variable. type Random starts with a capital
/* 
Random is built into Java. somebody wrote the class called Random.
if you want to create your own type in Java, ***create a class.***

The Random class file is in the Java API which is stored on the hard drive.
System.out.println is also in the Java API. 
*/
		int randomnumber = randomAnne.nextInt(100); 
//Method called nextInt(), in the Random class, some smart person wrote.
		System.out.println("The random number is " + randomnumber); 
	}

}
