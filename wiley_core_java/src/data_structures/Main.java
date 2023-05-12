package data_structures;

public class Main {
	public static void main(String[] args) {
        LinkedListMain list = new LinkedListMain();
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.insertAtEnd(15);
        list.insertAtBeginning(1);
        list.insertAtMiddle(7, 3);
        list.deleteAtBeginning();
        list.deleteAtEnd();
        list.deleteAtMiddle(2);
        list.sort();
        list.display(); // Output: 1 5 7 10 15
    }
}
