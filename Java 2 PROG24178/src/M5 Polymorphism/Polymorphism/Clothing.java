/** 
* 
* @author Anne Cho
*/

public abstract class Clothing {

     protected String name;
     protected int year;
     protected String label;

     public Clothing(String name, int year, String label){
          this.name = name;
          this.year = year;
          this.label = label;
     }

     public String getName(){
          return name;
     }

     public int getYear(){
          return year;
     }

     public String getLabel(){
          return label;
     }

     public void welcome(){
          System.out.println("you've got " + this.name + " from " + this.label + "!");
     }

     public abstract void description();  
}
