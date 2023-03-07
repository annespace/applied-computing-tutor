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
          for(int index=0; index<numTours; index++){
               System.out.println(tours[index].getName());
          }
     }



     
}
