public class addNumber {

          public static void main(String[] args){ 
          
               System.out.println(addOne(9)); 
               System.out.println(addTwo(0)); 
          } 
          
          public static int addOne(int number){ 
               return number + 1;
          } 
          
          public static int addTwo(int number){ 
               // int result = addOne(number); 
               // result = addOne(result); 
               // return result; 
          
               // number = addOne(number); 
               // number = addOne(number); 
               // return number; 
               return addOne(addOne(number)); 
          } 

}

