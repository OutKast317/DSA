import java.util.*;

public class PriorityQueueString {
    public static void main(String[] args) {
      Queue<String> stringQueue = new PriorityQueue<>();
      
      stringQueue.offer("E");
      stringQueue.offer("A");
      stringQueue.offer("C");
      stringQueue.offer("F");
      stringQueue.offer("B");
      stringQueue.offer("D");
      
      System.out.println(stringQueue); 
      
      //to get the list in correct alphabetical order
      //use poll()
      System.out.println("Default(ascending) order: "); 
      while (!stringQueue.isEmpty()){
        System.out.println(stringQueue.poll());//default order - alphabetical
      }
      
      //arranging string in reverse alphabetical order 
      Queue<String> reverseStringQueue = new PriorityQueue<>(Collections.reverseOrder());
      
      reverseStringQueue.offer("E");
      reverseStringQueue.offer("A");
      reverseStringQueue.offer("C");
      reverseStringQueue.offer("F");
      reverseStringQueue.offer("B");
      reverseStringQueue.offer("D");
      
      System.out.println("Reverse(descending) order: "); 
      while (!reverseStringQueue.isEmpty()){
        System.out.println(reverseStringQueue.poll());
      }
      
  }
}
