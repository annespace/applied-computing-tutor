/** 
* 
* @author Anne Cho
*/

/* An array of objects  */
public class TestMuseum {

     public static void main(String[] args) {

          // int[] myArrayOfInts = new int[5];
          // System.out.println(myArrayOfInts); //1@366af30c
          // System.out.println(myArrayOfInts[2]); //0

     Museum[] myMuseumArray = new Museum[3];
     System.out.println(myMuseumArray); //[LMuseum;@251a69d7
     System.out.println(myMuseumArray[2]); //null (which means no address)

     myMuseumArray[2] = new Museum("Tate", "London");
     System.out.println(myMuseumArray[2]);//Museum@6b95977
     System.out.println(myMuseumArray[2].getName());//Tate

     Museum[] museums = 
     {
          new Museum("Uffizi Gallery", "Florence"),
          new Museum(
               "Vatican Museums", "Vatican City"),
          new Museum("Doge's Palace", "Venice")
     };
     
     System.out.println(museums);//[LMuseum;@7e9e5f8a
     System.out.println(museums[0]);//Museum@8bcc55f
     System.out.println(museums[0].getLocation());//Florence
          
     }
     
}
