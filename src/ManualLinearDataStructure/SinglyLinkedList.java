package manualLineardatastructure;

//Link class to represent nodes
class Link{
    public long data;
    public Link next;

    public Link(long data){
        this.data = data;
    }

    public void display(){
        System.out.print(data + " ");
    }
}


class LinkedListClass{
    private Link first;
    
    public LinkedListClass(){
        first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    //search/check if a key exists
    public boolean contains(long key){
        Link currentLink = first;
        while (currentLink != null){
            if (currentLink.data == key){
                return true;
                
            }
            currentLink = currentLink.next;
        }
        return false;
    }

    /*
    public int getSize(){
        int count = 0;
        Link currentLink = first;
        while (currentLink != null){
            count++;
            currentLink = currentLink.next;
        }
        return count;
    }
     */

    private int size = 0;

    public int getSize(){
        return size;
    }

    /*
    //force add key to the first, it will break the logic of sorted list (insertKey() method) 
    public void insertFirst(long data){
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
    }
    should not use this method if you want sorted list
     */

    //insert function
    public void sortedInsertKey(long key){
        
        if (contains(key)){
            System.out.println(key + " already exists. Please do not re-enter the same key.");
            return;
        }

        Link newLink = new Link(key);
        Link previousLink = null; //start at head
        Link currentLink = first; //start at head

        while (currentLink != null && key > currentLink.data){
            previousLink = currentLink;
            currentLink = currentLink.next; 
        }

        if (previousLink == null){
            first = newLink;
        } else {
            previousLink.next = newLink;
        }
        newLink.next = currentLink;

        size++;
    }

    public Link removeFirstKey(){
        if (first == null) return null;
        Link tempLink = first;
        first = first.next;
        size--;
        return tempLink;

    }

    public boolean removeByKey(long key){
        Link current, previous;
        current = first; //to scan through the list
        previous = null; //track the node before current

        //traversing until we find the node with matching key
        while (current != null && current.data != key){
            previous = current;
            current = current.next;
        }

        //check if key found
        if (current == null) return false;

        //key removal handling (remove the head)
        if (previous == null) {
            first = current.next;
        } else {
            previous.next = current.next;
        }
        size--;
        return true;
    }
    
    public void displayList(){
        if (first == null){
            System.out.println("Empty List!");
            return;
        }

        Link currentLink = first;
        while (currentLink != null){
            currentLink.display();
            currentLink = currentLink.next;
        } 
    }

    public void clear(){
        first = null;
        size = 0; //reset the size
    }

    public void reverseList() {
        Link previous = null;
        Link current = first;

        while (current != null) {
            Link next = current.next; // store next node
            current.next = previous; // reverse the link
            previous = current; // move previous to current
            current = next; // move to next node
        }
        first = previous; // update head to new first node
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedListClass linkedList = new LinkedListClass();
        //Test cases
        //We will perform basic array operations: insertion, deletion, searching, traversal, and sorting
        /*Complexity of each operation:
        Insertion : O(1) -> constant
        Deletion : O(n)
        Traversal : O(n)
        Searching : O(n)
        */

        //inserting / adding data
        linkedList.sortedInsertKey(10);
        linkedList.sortedInsertKey(40);
        linkedList.sortedInsertKey(20);
        linkedList.sortedInsertKey(30);
        linkedList.sortedInsertKey(50);
        linkedList.sortedInsertKey(20);//not able to enter repeated key
        //displaying original list
        System.out.print("Original List: ");
        linkedList.displayList();
        //reversing the list
        linkedList.reverseList();
        System.out.print("\nReversed List: ");
        linkedList.displayList();
        int sizeOfList = linkedList.getSize();
        System.out.println("\nSize of the list: " + sizeOfList);
        System.out.println("\nIs the list empty?: " + linkedList.isEmpty()); // check if the list is empty

        System.out.println("Does the list contain 20?: " + linkedList.contains(20));//check if the key (20) exists

        //will sort the list in ascending order

        /* 
        linkedList.insertFirst(11); // will add data to the head (force)
        
        shouldn't use this as this will mess with the sorted list.
        */
        //removing head from node
        linkedList.removeFirstKey();
        System.out.println("\nAfter removing the first key: ");
        linkedList.displayList();

        //removing the desired key
        linkedList.removeByKey(40);
        System.out.println("\nAfter removing by key: ");
        linkedList.displayList();

        System.out.println("\n---After clearing the list---");
        linkedList.clear();
        System.out.println("\nSize of the list: " + linkedList.getSize());

 
    }    
}
