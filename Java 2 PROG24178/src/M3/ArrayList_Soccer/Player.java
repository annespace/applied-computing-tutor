/** 
* 
* @author Anne Cho
*/

public class Player {

     private String name;
     private Nationality nationality;

     public Player(String name, Nationality nationality){
          this.name = name;
          this.nationality = nationality;
     }

     public String getName(){
          return name;
     }
     
     public Nationality getNationality(){
          return nationality;
     }
}
