/** 
* 
* @author Anne Cho
*/

public class TestNationalMuseumOfKorea {

     public static void main(String[] args) throws Exception {

     NationalMuseumOfKorea ticket1 = new NationalMuseumOfKorea();
     ticket1.setName("Anne");
     ticket1.setQty(2);
     ticket1.setMonth(2);
     ticket1.setDay(19);
     System.out.println(ticket1.getName());
     System.out.println(ticket1);

     NationalMuseumOfKorea ticket2 = new NationalMuseumOfKorea("Molly", 3, 3, 11);
     System.out.println(ticket2.getName());
     System.out.println(ticket2);

     NationalMuseumOfKorea ticket3 = new NationalMuseumOfKorea("Lia", 1000, 5, 27);
     System.out.println(ticket3);
     }

     //https://www.javatpoint.com/understanding-toString()-method
}
