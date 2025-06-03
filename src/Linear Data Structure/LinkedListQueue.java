import java.util.*;

public class LinkedListQueue {
  public static void main(String[] args) {
    
    //linkedlist as queue
    LinkedList<String> queueList = new LinkedList<>();
    queueList.offer("A");
    queueList.offer("B");
    queueList.offer("C");
    queueList.offer("D");
    queueList.offer("E");
    
    System.out.println("LinkedList as Queue: " + queueList);
    System.out.println("Size of queue: " + queueList.size());//size of queueList
    System.out.println("First added element: " + queueList.peekFirst());//check first added element, can also use queue.getFirst() or queue.peek()
    System.out.println("Last added element: " + queueList.peekLast());//check last added element, can also use queue.getLast()
    System.out.println("Removed element: " + queueList.poll());//remove first added element (first in queue)

    queueList.add("F");//adding an element to the end of the queue
    System.out.println("Queue after adding: " + queueList);//queue after adding
    queueList.remove("C");
    System.out.println("Queue after removing: " + queueList);//queue after removing
    System.out.println("Is queue empty?: " + queueList.isEmpty());//check if queue is empty
  }
}