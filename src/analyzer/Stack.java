package analyzer;

public class Stack {

    private int[] stack;
    private int top;
    private int size;

    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    // Push an element into the stack
    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack is full.");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed into stack.");
        }
    }

    // Remove the top element
    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop.");
        } else {
            System.out.println(stack[top] + " popped from stack.");
            top--;
        }
    }

    // View the top element
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    // Display all elements
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}