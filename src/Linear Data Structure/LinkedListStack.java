import java.util.*;

public class LinkedListStack {
  public static void main(String[] args) {
    
    //linkedlist as stack
    LinkedList<String> stack = new LinkedList<>();
    stack.push("A");
    stack.push("B");
    stack.push("C");
    stack.push("D");
    stack.push("E");

    System.out.println("LinkedList as Stack: " + stack);
    System.out.println("Size of stack: " + stack.size());//size of stack
    System.out.println("Top of stack: " + stack.peek());//top of stack (last added element), can also use stack.getFirst() or stack.peekFirst()
    System.out.println("First added element: " + stack.peekLast());//check first added element, can also use stack.getLast()
    System.out.println("Removed Element: " + stack.pop());//remove top of stack (last added element)
    System.out.println("Stack after pop: " + stack);//stack after pop
    System.out.println("Is stack empty?: " + stack.isEmpty());//check if stack is empty

  }
}
