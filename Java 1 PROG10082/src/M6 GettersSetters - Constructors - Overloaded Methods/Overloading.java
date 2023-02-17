public class Overloading {

     public int getAve(int n1)
     {
         return n1;
     }

     public int getAve(int n1, int n2)
     {
         return (n1+n2)/2;
     }
 
     public double getAve(int n1, int n2, int n3)
     {
         return (n1+n2+n3)/3;
     }

     // public int getAve(int n1, int n2, int n3)
     // {
     //     return (n1+n2+n3)/3; //error
     // }

     public double getAve(double n1, int n2, int n3)
     {
         return (n1+n2+n3)/3;
     }
 
 }
 //https://www.javatpoint.com/method-overloading-in-java