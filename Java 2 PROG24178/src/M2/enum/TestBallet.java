/** 
* 
* @author Anne Cho
*/

public class TestBallet {

     public static void main(String[] args) {
          
          // Ballet anne = new Ballet("advanced");
          // Ballet jennie = new Ballet("advancedd");
          Ballet anne = new Ballet(BalletLevel.ADVANCED);
          Ballet jennie = new Ballet(BalletLevel.INTERMEDIATE);
          System.out.println(anne.equals(jennie));          
     }
     
}
