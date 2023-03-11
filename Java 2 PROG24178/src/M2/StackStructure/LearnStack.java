/** 
* 
* @author Anne Cho
*/
import java.util.Stack;

public class LearnStack {

     public static void main(String[] args) {

//a stack; LIFO structure; Last-In-First-Out; like a tray
          Stack <Clothing> stack = new <Clothing> Stack();
          stack.push(new Clothing("dress", "Reformation"));
          stack.push(new Clothing("skirt", "Wilfred"));
          stack.push(new Clothing("t-shirt","Patagonia"));
          stack.push(new Clothing("Jeans","Levis"));
          System.out.println(stack.size());
//stack.pop() function in Java returns the element that is available at the top of the stack and removes that element from the stack.
          System.out.println(stack.pop().getBrand());
          System.out.println(stack.pop().getBrand());
//stack.peek() is used to get the reference of the element at the stack's top
          System.out.println(stack.peek().getBrand());
          System.out.println(stack.pop().getBrand());
          System.out.println(stack.size());

     }
     
}
