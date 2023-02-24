/** 
* 
* @author Anne Cho
*/

public class Arrays {
     
     public static void main(String[] args) {

     /*
     An array is an object contains a bunch of one particular type of variable. 
     We can create arrays by using new operator.
     It means Arrays have built in methods and instance variables such as .length.
     */   
    
     int[] annes = new int[3];
     /*
     annes is a reference variable.
     Even though this type starts from a lowercase (int[])
     It holds the address of an object and that object has room to store 3 int values.
      */
     System.out.println(annes);
     System.out.println(annes[2]);
     }
     
}
