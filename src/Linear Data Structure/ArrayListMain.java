import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain {
    public static void main(String[] args) {
      ArrayList<Double> list = new ArrayList<>();
      
      list.add(6.3);
      list.add(5.5);
      list.add(1.7);
      list.add(2.1);
      list.add(3.0);
      
      System.out.println("Size of array list: " + list.size());//size of ArrayList
      System.out.println("Original: " + list);
      
      //adding an element to a specific Index
      list.add(1, 4.6);
      System.out.println("After adding: " + list);
      
      //accessing an index
      System.out.println("Getting an item: " + list.get(0));
      
      //looping through ArrayList
      System.out.println("\nLooping through the array list: ");
      for (Double i : list){
        System.out.println(i);
      }
      
      //sorting an array list
      Collections.sort(list);
      System.out.println("\nAfter sorting (ascending): " + list);//ascending order
      
      Collections.sort(list, Collections.reverseOrder());//descending order
      System.out.println("After sorting (descending): " + list);
      
      //changing an item
      list.set(0, 6.5);
      System.out.println("After changing: " + list);
      
      //removing an item
      list.remove(2);//removing by defining an index 
      list.remove(5.5);//removing by defining an item
      System.out.println("After removing: " + list);
      
  }
}
