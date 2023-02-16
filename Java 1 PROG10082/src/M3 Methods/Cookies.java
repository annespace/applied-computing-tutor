public class Cookies { 

	public static void main (String[] args) { 
	
          //Methods allow us to organize code
		gatherCookieIngredients(); 
		mixCookieIngredients(); 
		bakeCookies(); 
		eatCookies(); 
	}
	 
	public static void gatherCookieIngredients() { 
	
		System.out.println("Get a bowl from the cupboard"); 
		System.out.println("Get flour"); 
		System.out.println("get 2 eggs"); 
		System.out.println("get butter"); 
		System.out.println("Get Chocolate chips"); 
	} 
	
	public static void mixCookieIngredients() { 
	
		System.out.println("Add 1 cup of flour to bowl");
		System.out.println("Crack eggs and put it into the bowl"); 
		System.out.println("Add 1 cup of butter to the bowl"); 
		System.out.println("Add 1 cup of chocolate chips to bowl"); 
		System.out.println("Create 12 dough balls and place on tray"); 
	} 
	
	public static void bakeCookies() { 
	
		System.out.println("Turn on oven"); 
		System.out.println("Open Oven"); 
		System.out.println("Place tray in oven"); 
		System.out.println("Start timer"); 
		System.out.println("Wait for timer to ding"); 
	} 
	
	public static void eatCookies () { 
	
		System.out.println("Eat a cookie"); 
	} 
	
}