public class Student{

     private String name;
     private int studentNumber;
     private double gpa;
 
     public Student(){
     }
 
     public Student(String name, int studentNumber, double gpa) throws Exception {
         this.setName(name);
         this.setStudentNumber(studentNumber);
         this.setGpa(gpa);
     }
 
     public String getName() {
         return name;
     }
 
     public void setName(String name) {
         this.name = name;
     }
 
     public int getStudentNumber() {
         return studentNumber;
     }
 
     public void setStudentNumber(int studentNumber) throws Exception {
         if(studentNumber < 0 || studentNumber >9999){
             throw new Exception("Illegal Student Number: " + studentNumber);
         }
         this.studentNumber = studentNumber;
     }
 
     public double getGpa() {
         return gpa;
     }
 
     public void setGpa(double gpa) throws Exception {
         if(gpa <0 || gpa > 4.0){
             throw new Exception("Illegal GPA: " + gpa);
         }
         this.gpa = gpa;
     }
 }