package manuallineardatastructure;

public class TestDLL {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertEnd(10);
        dll.insertEnd(20);
        dll.insertFront(5);
        dll.insertFront(1);
        dll.traverseForward();   // 1 -> 5 -> 10 -> 20 -> null
        dll.traverseBackward();  // 20 <- 10 <- 5 <- 1 <- null

        dll.deleteFront();
        dll.traverseForward();   // 5 -> 10 -> 20 -> null

        dll.deleteEnd();
        dll.traverseForward();   // 5 -> 10 -> null
    }
}
