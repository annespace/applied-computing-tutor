/**
 *
 * @author Anne Cho
 */
import java.util.Stack;

public class LearnStack {

    public static void main(String[] args) {

// a stack; LIFO structure: Last-In-First-Out;
        Stack <Jeans> stack1 = new <Jeans> Stack();
        stack1.push(new Jeans("white", "Levis"));
        stack1.push(new Jeans("blue","Aritzia"));
        stack1.push(new Jeans("lightblue","Guess"));
        stack1.push(new Jeans("black", "Levis"));
// stack.size() function returns the number of elements in the stack.
        System.out.println(stack1.size());
/* stack.pop() function returns the element that is available at the top of the stack 
and removes that element from the stack. */
        System.out.println(stack1.pop().getBrand());
        System.out.println(stack1.pop().getBrand());
// stack.peek() is used to get the reference of the element at the stack's top
        System.out.println(stack1.peek().getBrand());
        System.out.println(stack1.pop().getBrand());
        System.out.println(stack1.peek().getBrand());
        System.out.println(stack1.size());

    }

}