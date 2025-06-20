package ManualLinearDataStructure;

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
    public void sortedInsertkey(long key){
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
    }

    public Link removeFirstKey(){
        Link tempLink = first;
        first = first.next;
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
        return true;
    }
    
    public void displayList(){
        Link currentLink = first;
        while (currentLink != null){
            currentLink.display();
            currentLink = currentLink.next;
        }
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedListClass linkedList = new LinkedListClass();
        //Test cases (insert, delete, search)

        //inserting / adding data
        linkedList.sortedInsertkey(10);
        linkedList.sortedInsertkey(40);
        linkedList.sortedInsertkey(20);
        linkedList.sortedInsertkey(30);
        linkedList.sortedInsertkey(50);
        System.out.println("Original List ");
        linkedList.displayList();

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
        linkedList.removeByKey(50);
        System.out.println("\nAfter removing by key: ");
        linkedList.displayList();


    }    
}
