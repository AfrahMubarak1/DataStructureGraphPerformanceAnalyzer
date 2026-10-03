package analyzer;

public class Queue {

    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public Queue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Add an element to the queue
    public void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue is full.");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = value;
            System.out.println(value + " added to queue.");
        }
    }

    // Remove the front element
    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
            System.out.println(queue[front] + " removed from queue.");
            front++;

            if (front > rear) {
                front = -1;
                rear = -1;
            }
        }
    }

    // View the front element
    public void peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element: " + queue[front]);
        }
    }

    // Display all elements
    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements:");
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}