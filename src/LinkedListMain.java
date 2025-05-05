import java.util.*;

public class LinkedListMain {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();

    list.add("A");
    list.add("B");
    list.add("D");
    list.add("F");
    list.add("C");
    list.add("E");

    System.out.println("Size of linked list: " + list.size());//size of LinkedList
    System.out.println("Original: " + list);

//adding an element to the beginning of the list
list.addFirst("Z");
System.out.println("After adding to the beginning: " + list);

//adding an element to the end of the list
list.addLast("P");
System.out.println("After adding to the end: " + list);

//accessing an index
System.out.println("Getting an item from a specific index: " + list.get(0));

//looping through LinkedList
System.out.println("\nLooping through the linked list: ");
for (String i : list) {
  System.out.println(i);
}

//sorting a linked list
Collections.sort(list);
System.out.println("\nAfter sorting (ascending): " + list);//ascending order

Collections.sort(list, Collections.reverseOrder());//descending order
System.out.println("After sorting (descending): " + list);

//changing an item
list.set(2, "X");//changing an item by defining an index
System.out.println("After changing: " + list);
//checking if an item exists
System.out.println("Checking if an item exists: " + list.contains("A"));

//checking if the list is empty
System.out.println("Checking if the list is empty: " + list.isEmpty());

//removing an item
list.remove(4);//removing by defining an index 
list.remove("A");//removing by defining an item
list.removeFirst();//removing the first item
list.removeLast();//removing the last item
System.out.println("After removing: " + list);

//clearing the list
list.clear();
System.out.println("After clearing: " + list);

//checking if the list is empty after clearing
System.out.println("Checking if the list is empty after clearing: " + list.isEmpty());

  }
}