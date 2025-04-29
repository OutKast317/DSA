import java.util.*;

public class PriorityQueue {
    public static void main(String[] args) {
      Queue<Double> queue = new PriorityQueue<>();
      
      queue.offer(3.0);
      queue.offer(2.5);
      queue.offer(3.8);
      queue.offer(3.2);
      queue.offer(4.0);
      
      System.out.println(queue);//only smallest number is guaranteed to come out first
      
      //to get the list in order
      //use poll()
      System.out.println("Default(ascending) order: "); 
      while (!queue.isEmpty()){
        System.out.println(queue.poll());//default order - ascending
      }
      
      //arranging number from largest to lowest 
      Queue<Double> reverseQueue = new PriorityQueue<>(Collections.reverseOrder());
      
      reverseQueue.offer(3.0);
      reverseQueue.offer(2.5);
      reverseQueue.offer(3.8);
      reverseQueue.offer(3.2);
      reverseQueue.offer(4.0);
      
      System.out.println("Reverse(descending) order: "); 
      while (!reverseQueue.isEmpty()){
        System.out.println(reverseQueue.poll());
      }
  }
}
