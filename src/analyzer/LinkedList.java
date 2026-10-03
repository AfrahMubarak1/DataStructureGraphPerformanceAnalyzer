package analyzer;

public class LinkedList {

    private Node head;

    // Node class
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert an element at the end
    public void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        System.out.println(value + " inserted into linked list.");
    }

    // Delete an element
    public void delete(int value) {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }

        if (head.data == value) {
            head = head.next;
            System.out.println(value + " deleted from linked list.");
            return;
        }

        Node current = head;

        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println(value + " not found in linked list.");
        } else {
            current.next = current.next.next;
            System.out.println(value + " deleted from linked list.");
        }
    }

    // Search for an element
    public boolean search(int value) {
        Node current = head;

        while (current != null) {
            if (current.data == value) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    // Display all elements
    public void display() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }

        Node current = head;

        System.out.print("Linked List: ");

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}