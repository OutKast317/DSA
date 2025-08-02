package manuallineardatastructure;

public class DoublyLinkedList {
    Node head;

    // Insert at the front
    public void insertFront(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    // Insert at the end
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete from front
    public void deleteFront() {
        if (head == null) return;
        head = head.next;
        if (head != null)
            head.prev = null;
    }

    // Delete from end
    public void deleteEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.prev.next = null;
    }

    // Traverse forward
    public void traverseForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Traverse backward
    public void traverseBackward() {
        Node temp = head;
        if (temp == null) return;

        // Go to tail
        while (temp.next != null)
            temp = temp.next;

        // Now move backward
        while (temp != null) {
            System.out.print(temp.data + " <- ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
}

