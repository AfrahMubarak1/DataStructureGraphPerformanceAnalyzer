package analyzer;

public class ArrayOperations {

    private int[] array;
    private int size;

    public ArrayOperations(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    // Insert an element
    public void insert(int value) {
        if (size == array.length) {
            System.out.println("Array is full.");
        } else {
            array[size] = value;
            size++;
            System.out.println(value + " inserted into array.");
        }
    }

    // Delete an element
    public void delete(int value) {
        int index = search(value);

        if (index == -1) {
            System.out.println(value + " not found in array.");
        } else {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }

            size--;
            System.out.println(value + " deleted from array.");
        }
    }

    // Search for an element
    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }

    // Display all elements
    public void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
        } else {
            System.out.println("Array elements:");

            for (int i = 0; i < size; i++) {
                System.out.println(array[i]);
            }
        }
    }
}