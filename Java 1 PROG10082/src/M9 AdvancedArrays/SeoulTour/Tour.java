public class Tour {

     private String name;
     private String nearStation;

     public Tour(String name, String nearStation){
          this.name = name;
          this.nearStation = nearStation;
     }

     public String getName(){
          return name;
     }

     public void setName(String name){
          this.name = name;
     }

     public String getNearStation(){
          return nearStation;
     }

     public void setNearStation(String nearStation){
          this.nearStation = nearStation;
     }
     
}
