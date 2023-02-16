public class FriendlyDate {

     public int year;
     public int month;
     public int day;
 
     public int getYear() {
         return year;
     }
 
     public void setYear(int year) throws Exception
     {
         if(year != 2023){
             Exception e = new Exception("Invalid data: "+ year);
             throw e;
         } else {
             this.year = year;
         }
     }
 
     public int getMonth() {
         return month;
     }
 
     public void setMonth(int month) throws Exception
     {
         if (month > 12 || month < 1 ){
             Exception e = new Exception("Invalid data: " + month);
             throw e;
         } else {
             this.month = month;
         }
     }
 
     public int getDay() {
         return day;
     }
 
     public void setDay(int day) throws Exception {
         if (day >31 || day < 1){
             Exception e = new Exception("Invalid data: " + day);
             throw e;
         } else {
             this.day = day;
         }
     }
 
     public String getFriendlyDate()
     {
         String date = "";
         switch (month) {
             case 1:
                 date = "Jan";
                 break;
             case 2:
                 date = "Feb";
                 break;
             case 3:
                 date = "Mar";
                 break;
             case 4:
                 date = "Apr";
                 break;
             case 5:
                 date = "May";
                 break;
             case 6:
                 date = "Jun";
                 break;
             case 7:
                 date = "Jul";
                 break;
             case 8:
                 date = "Aug";
                 break;
             case 9:
                 date = "Sep";
                 break;
             case 10:
                 date = "Oct";
                 break;
             case 11:
                 date = "Nov";
                 break;
             case 12:
                 date = "Dec";
                 break;
         }
         return date += " " + day + ", " + year;
     }
 }