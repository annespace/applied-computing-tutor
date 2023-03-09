/** 
* 
* @author Anne Cho
*/

public class SeoulTour {

     public Tour[] tours;
     private int numTours;

     public SeoulTour(int arraySize){
          tours = new Tour[arraySize];
     }

     public int getNumTours(){
          return numTours;
     }

     public Tour getTourByIndex(int index) {
               return tours[index];
     }

     public int getIndexOfTourByName(String name) throws Exception{
          for(int i = 0; i < tours.length; i++){
               if(tours[i].getName()==name){
                    return i;
               }
          }
          throw new Exception("No matches found");
     }

     public void deleteTourByIndex(int index){
          tours[index] = null;
          numTours--;
     }

     public void addTour(Tour objt) throws Exception {
          //should be tours.length, not numTours. for Exception.
          for(int index=0; index<tours.length; index++){
               if(tours[index]==null){
                    tours[index] = objt;
                    numTours++;
                    return;
               }
          }
          throw new Exception("Maximum capacity is reached");
     }

     public void printTour(){
          for(int index=0; index<tours.length; index++){
               if(tours[index] != null){
               System.out.println(tours[index].getName());
               }
          }
     }



     
}
