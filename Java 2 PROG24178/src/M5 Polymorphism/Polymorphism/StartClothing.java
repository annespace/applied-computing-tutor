/** 
* 
* @author Anne Cho
*/

public class StartClothing {

     public static void main(String[] args) {

          Clothing[] clothes = {new Top("classic retro hoddie","patagonia"),
          new Dress("maxi dress","princess-polly"),
          new Skirt("angle pleated skirt","club monaco")};

          for(int i = 0; i < clothes.length; i++){
               clothes[i].welcome();
               clothes[i].description();
               System.out.println("");
          }

     }
     
}
