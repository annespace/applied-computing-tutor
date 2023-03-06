/** 
* 
* @author Anne Cho
*/

public class TravelHistory {

     public String[] locations;

     public TravelHistory(int arraySize) {
          locations = new String[arraySize];
     }

     public void addLocation(String location) throws Exception{
          for(int index = 0; index < locations.length; index++){
               if(locations[index]==null){
               locations[index] = location;
               return;
               }
          }
      throw new Exception("Maximum capacity is reached");
     }

     public void printLocation(){
          for(int index = 0; index < locations.length; index++){
               System.out.println(locations[index]);
          }
     }
     
}
