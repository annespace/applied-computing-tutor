public class Roll { 

	public static void main (String[] args) { 

		//creating an object
		Dice dice = new Dice(); 
		
		int sum = 0; 
		for(int i = 0 ; i < 20 ; i++) { 
			int number = dice.roll(); 
			System.out.print(number + "+ "); 
			sum += number; 
		} 
		
		System.out.println(sum); 
		
		} 
}