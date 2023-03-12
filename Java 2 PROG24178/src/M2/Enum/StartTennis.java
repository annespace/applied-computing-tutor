/** 
* 
* @author Anne Cho
*/

public class StartTennis {

     public static void main(String[] args) {

          Tennis anne = new Tennis(TennisLevel.ADVANCED);
          Tennis spitz = new Tennis(TennisLevel.ADVANCED);
          Tennis husky = new Tennis(TennisLevel.BEGINNER);
          System.out.println(anne.equals(spitz));
          System.out.println(anne.equals(husky));
          Center seoul = new Center(anne);
          System.out.println(seoul);
          System.out.println(seoul.getTennis());
          System.out.println(seoul.getTennis().getTennisLevel());


     }
     
}
