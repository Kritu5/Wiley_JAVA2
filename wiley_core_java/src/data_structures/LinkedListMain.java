package data_structures;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListMain {
    Node head;

    public LinkedListMain() {
        this.head = null;
    }

    // Insert node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Insert node at the middle
    public void insertAtMiddle(int data, int position) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        int count = 1;
        while (count < position - 1 && current.next != null) {
            current = current.next;
            count++;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Delete node at the beginning
    public void deleteAtBeginning() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    // Delete node at the end
    public void deleteAtEnd() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Delete node at the middle
    public void deleteAtMiddle(int position) {
        if (head == null) {
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        Node current = head;
        int count = 1;
        while (count < position - 1 && current.next != null) {
            current = current.next;
            count++;
        }
        if (current.next == null) {
            return;
        }
        current.next = current.next.next;
    }

    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Search for a node by key
    public boolean searchByKey(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Sort the linked list
    public void sort() {
        Node current = head, index = null;
        int temp;
        if (head == null) {
            return;
        }
        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }
}

