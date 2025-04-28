//queue -> FIFO (first in first out)
//queue is not a class but interface
//dequeue - remove, enqueue - add
//offer() - add, poll() - remove
//two types of classes to implement queue - priority queue, linked list queue

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        
        System.out.println("Before adding/enqueuing: " + queue.isEmpty());
        
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("E");
        
        System.out.println(queue);
        
        System.out.println(queue.size());
        System.out.println("After adding/enqueuing: " + queue.isEmpty());
        System.out.println(queue.peek());//first added item
        System.out.println(queue.contains("C"));
        System.out.println(queue.poll());
        System.out.println("After removing: " + queue);
        System.out.println("Size of queue after removing: " + queue.size());
  }
}
