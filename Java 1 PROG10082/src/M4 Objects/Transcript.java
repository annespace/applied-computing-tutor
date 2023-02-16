public class Transcript { 

	public static void main(String[] args){ 

		Grade student1 = new Grade(); 
		student1.name = "Anne"; 
		student1.java1 = 95; 
		student1.dataNetworking = 86; 
		student1.math = 83; 
		student1.webDevelopment = 70; 
		
		System.out.println(student1.getAve()); 
		System.out.println(student1.transcript()); 
	} 
}