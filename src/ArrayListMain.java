import java.util.*;

public class ArrayListMain {
    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<>();
      
      list.add("A");
      list.add("C");
      list.add("E");
      list.add("D");
      list.add("B");
      
      System.out.println("Size of array list: " + list.size());//size of ArrayList
      System.out.println("Original: " + list);
      
      //adding an element to a specific Index
      list.add(1, "F");
      System.out.println("After adding: " + list);
      
      //accessing an index
      System.out.println("Getting an item: " + list.get(0));
      
      //looping through ArrayList
      System.out.println("\nLooping through the array list: ");
      for (String i : list){
        System.out.println(i);
      }
      
      //sorting an array list
      Collections.sort(list);
      System.out.println("\nAfter sorting: " + list);
      
      //changing an item
      list.set(0, "F");
      System.out.println("After changing: " + list);
      
      //removing an item
      list.remove(2);//removing by defining an index 
      list.remove("F");//removing by defining an item
      System.out.println("After removing: " + list);
      
  }
}
