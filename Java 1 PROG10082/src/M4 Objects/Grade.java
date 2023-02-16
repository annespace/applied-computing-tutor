public class Grade { 

	public String name; 
	public double java1; 
	public double dataNetworking; 
	public double math; 
	public double webDevelopment; 
     public int numOfSubject = 4;

	
	public double getAve() { 
		return ((java1 + dataNetworking + math + webDevelopment) / numOfSubject); 
	} 
	
	public String transcript() { 
		double average = getAve();
		return name + String.format(", You've got %.2f", average ); 
	} 
}