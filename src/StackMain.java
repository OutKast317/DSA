// Stack = LIFO (Last In First Out) data structure
// similar to book tower/book stacking 

import java.util.Stack;

public class StackMain {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();
    // Adding elements to the stack = push()
    stack.push("A");
    stack.push("B");
    stack.push("C");

    System.out.println("Stack: " + stack);

    System.out.println("Size of stack: " + stack.size()); // Size of the stack
    
    System.out.println("Position of A: " + stack.search("A")); // Find position of element A
    
    System.out.println("Peek: " + stack.peek()); // Peek at the top element (last added/pushed)

    String a = stack.pop(); // Remove the top element (last added/pushed) = pop()
    System.out.println("Popped/Removed element: " + a);

    System.out.println("Stack after pop: " + stack);
  
  }
}
