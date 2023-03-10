/** 
* 
* @author Anne Cho
*/

public class Ballet {

     private BalletLevel balletLevel;

     public Ballet(BalletLevel balletLevel){
          this.balletLevel = balletLevel;
     }
     
     public BalletLevel getBalletLevel(){
          return balletLevel;
     }

     public void setBalletLevel(BalletLevel balletLevel){
          this.balletLevel = balletLevel;
     }

     public boolean equals(Ballet objt){
          return this.balletLevel.equals(objt.balletLevel);
     }

}
