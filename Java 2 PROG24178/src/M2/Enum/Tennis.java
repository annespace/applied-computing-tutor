/** 
* 
* @author Anne Cho
*/

public class Tennis {

     private TennisLevel tennisLevel;

     public Tennis(TennisLevel tennisLevel){
          this.tennisLevel = tennisLevel;
     }
     
     public TennisLevel getTennisLevel(){
          return tennisLevel;
     }

     public void setTennisLevel(TennisLevel tennisLevel){
          this.tennisLevel = tennisLevel;
     }

     public boolean equals (Tennis objt){
          return this.tennisLevel.equals(objt.tennisLevel);
     }
}
