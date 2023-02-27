/** 
* 
* @author Anne Cho
*/

public class NationalMuseumOfKorea {

     private String name;
     private int qty;
     private String month;
     private int day;
     public final int YEAR = 2023;

     // Empty(Default) Constructor
     public NationalMuseumOfKorea(){
     }

     // Constructor
     public NationalMuseumOfKorea(String name, int qty, int month, int day) throws Exception {
          this.name = name;
          this.setQty(qty);
          this.setMonth(month);
          this.setDay(day);
     }

     // Getters And Setters
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return this.qty;
	}

	public void setQty(int qty) throws Exception {
          if(qty<=0) {
               throw new Exception("quantity must be greater than 0");
          }
          else if(qty>999) {
               throw new Exception("quantity must be less than 1000");
          }
          else {
		this.qty = qty;
          }
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(int month) throws Exception {
          if(month > 12 || month < 1) {
               throw new Exception("illegal data");
          }
          else {
               switch (month) {
                    case 1:
                         this.month="January";
                         break;
                    case 2:
                         this.month="February";
                         break;
                    case 3:
                         this.month="March";
                        break;
                    case 4:
                         this.month="April";
                        break;
                    case 5:
                         this.month="May";
                        break;
                    case 6:
                         this.month="June";
                        break;
                    case 7:
                         this.month="July";
                        break;
                    case 8:
                         this.month="August";
                        break;
                    case 9:
                         this.month="September";
                        break;
                    case 10:
                         this.month="October";
                        break;
                    case 11:
                         this.month="November";
                        break;
                    case 12:
                         this.month="December";
                        break;
                    }
               }
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) throws Exception {
          if(day > 31 || day < 1) {
               throw new Exception("illegal data");
          }
          else {
		this.day = day;
          }
     }

     public String toString(){
          return "Hello, " + getName() + "👋 You've got " + getQty() +" ticket(s) for NATIONAL MUSEUM OF KOREA \r\n"
          + "We're looking forward seeing you in " + getMonth() + " " + getDay() + " " + YEAR + "🌻";
     }
}