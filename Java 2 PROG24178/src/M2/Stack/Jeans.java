/**
 *
 * @author Anne Cho
 */

 public class Jeans {

     private String color;
     private String brand;
 
     public Jeans(String color, String brand){
         this.color = color;
         this.brand = brand;
     }
 
     public String getType(){
         return color;
     }
 
     public String getBrand(){
         return brand;
     }
 
 }