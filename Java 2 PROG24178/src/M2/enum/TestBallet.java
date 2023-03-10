/** 
* 
* @author Anne Cho
*/

public class TestBallet {

     public static void main(String[] args) {
          /* FOR ENUM
          // Ballet anne = new Ballet("advanced");
          // Ballet jennie = new Ballet("advancedd");
          Ballet anne = new Ballet(BalletLevel.ADVANCED);
          Ballet jennie = new Ballet(BalletLevel.INTERMEDIATE);
          System.out.println(anne.equals(jennie)); 
          */

          Ballet anne = new Ballet(BalletLevel.ADVANCED);
          Center seoulBranch = new Center(anne);
          System.out.println(seoulBranch);
          System.out.println(seoulBranch.getBallet());
          System.out.println(seoulBranch.getBallet().getBalletLevel());
          
     }
     
}
