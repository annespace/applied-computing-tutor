/** 
* 
* @author Anne Cho
*/

public class AdvancedTravelHistory {

     private String name;
     private String city;
     private String country;
     private String[] spots = new String[4];
     private int numSpots = 0;

     public AdvancedTravelHistory(String name, String city, String country){
          this.name = name;
          this.city = city;
          this.country = country;
     }

     public void addSpot(String spot) throws Exception{
          if(numSpots>=spots.length){
               throw new Exception("Maximum capacity is reached");
          }
          spots[numSpots] = spot;
          numSpots++;
     }

     public void printHistory(){
          System.out.println("Name: " + name);
          System.out.println("City: " + city);
          System.out.println("Country: " + country);
          System.out.print("Traveling spots: ");
          for(int index = 0 ; index < numSpots; index++){
               System.out.print(spots[index] + ", ");
          }
          System.out.println("");
     }

     public String getName(){
          return this.name;
     }

     public String getCity(){
          return this.city;
     }

     public String getCountry(){
          return this.country;
     }    
}
