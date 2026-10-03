package analyzer;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static ArrayOperations array = new ArrayOperations(10);
    static Stack stack = new Stack(10);
    static Queue queue = new Queue(10);
    static LinkedList linkedList = new LinkedList();
    static Graph graph = new Graph();

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n=============================================");
            System.out.println("     DATA STRUCTURE & GRAPH ANALYZER");
            System.out.println("=============================================");
            System.out.println("1. Array Operations");
            System.out.println("2. Stack Operations");
            System.out.println("3. Queue Operations");
            System.out.println("4. Linked List Operations");
            System.out.println("5. Searching Operations");
            System.out.println("6. Graph Operations");
            System.out.println("7. Performance Comparison");
            System.out.println("8. Display All Results");
            System.out.println("9. Exit");
            System.out.println("=============================================");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    arrayMenu();
                    break;

                case 2:
                    stackMenu();
                    break;

                case 3:
                    queueMenu();
                    break;

                case 4:
                    linkedListMenu();
                    break;

                case 5:
                    searchingMenu();
                    break;

                case 6:
                    graphMenu();
                    break;

                case 7:
                    performanceMenu();
                    break;

                case 8:
                    displayAllResults();
                    break;

                case 9:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 9);

        scanner.close();
    }

    // ================= ARRAY MENU =================

    public static void arrayMenu() {

        int choice;

        do {
            System.out.println("\n----------- ARRAY OPERATIONS -----------");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int value = scanner.nextInt();
                    array.insert(value);
                    break;

                case 2:
                    System.out.print("Enter value to delete: ");
                    value = scanner.nextInt();
                    array.delete(value);
                    break;

                case 3:
                    System.out.print("Enter value to search: ");
                    value = scanner.nextInt();

                    int index = array.search(value);

                    if (index == -1) {
                        System.out.println("Element not found.");
                    } else {
                        System.out.println("Element found at index " + index + ".");
                    }
                    break;

                case 4:
                    array.display();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }

    // ================= STACK MENU =================

    public static void stackMenu() {

        int choice;

        do {
            System.out.println("\n----------- STACK OPERATIONS -----------");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }

    // ================= QUEUE MENU =================

    public static void queueMenu() {

        int choice;

        do {
            System.out.println("\n----------- QUEUE OPERATIONS -----------");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek / Front");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.peek();
                    break;

                case 4:
                    queue.display();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }

    // ================= LINKED LIST MENU =================

    public static void linkedListMenu() {

        int choice;

        do {
            System.out.println("\n----------- LINKED LIST OPERATIONS -----------");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int value = scanner.nextInt();
                    linkedList.insert(value);
                    break;

                case 2:
                    System.out.print("Enter value to delete: ");
                    value = scanner.nextInt();
                    linkedList.delete(value);
                    break;

                case 3:
                    System.out.print("Enter value to search: ");
                    value = scanner.nextInt();

                    if (linkedList.search(value)) {
                        System.out.println("Element found.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;

                case 4:
                    linkedList.display();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }

    // ================= SEARCHING MENU =================

    public static void searchingMenu() {

        int[] searchArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("\n----------- SEARCHING OPERATIONS -----------");
        System.out.println("Array used for searching:");
        
        for (int value : searchArray) {
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.print("Enter value to search: ");
        int target = scanner.nextInt();

        int linearResult =
                Searching.linearSearch(searchArray, searchArray.length, target);

        int binaryResult =
                Searching.binarySearch(searchArray, searchArray.length, target);

        Searching.displayResult("Linear Search", linearResult);
        Searching.displayResult("Binary Search", binaryResult);
    }

    // ================= GRAPH MENU =================

    public static void graphMenu() {

        int choice;

        do {
            System.out.println("\n----------- GRAPH OPERATIONS -----------");
            System.out.println("1. Add Vertex");
            System.out.println("2. Add Edge");
            System.out.println("3. Display Graph");
            System.out.println("4. BFS Traversal");
            System.out.println("5. DFS Traversal");
            System.out.println("6. Return to Main Menu");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter vertex: ");
                    int vertex = scanner.nextInt();
                    graph.addVertex(vertex);
                    break;

                case 2:
                    System.out.print("Enter source vertex: ");
                    int source = scanner.nextInt();

                    System.out.print("Enter destination vertex: ");
                    int destination = scanner.nextInt();

                    graph.addEdge(source, destination);
                    break;

                case 3:
                    graph.displayGraph();
                    break;

                case 4:
                    System.out.print("Enter starting vertex: ");
                    vertex = scanner.nextInt();
                    graph.bfs(vertex);
                    break;

                case 5:
                    System.out.print("Enter starting vertex: ");
                    vertex = scanner.nextInt();
                    graph.dfs(vertex);
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);
    }

    // ================= PERFORMANCE MENU =================

    public static void performanceMenu() {

        int choice;

        do {
            System.out.println("\n----------- PERFORMANCE COMPARISON -----------");
            System.out.println("1. Compare Linear and Binary Search");
            System.out.println("2. Compare BFS and DFS");
            System.out.println("3. Return to Main Menu");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    int[] performanceArray =
                            {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

                    System.out.print("Enter value to search: ");
                    int target = scanner.nextInt();

                    PerformanceAnalyzer.compareSearching(
                            performanceArray, target);

                    break;

                case 2:
                    System.out.print("Enter starting vertex: ");
                    int startVertex = scanner.nextInt();

                    PerformanceAnalyzer.compareGraphTraversals(
                            graph, startVertex);

                    break;

                case 3:
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);
    }

    // ================= DISPLAY ALL RESULTS =================

    public static void displayAllResults() {

        System.out.println("\n=============================================");
        System.out.println("           DISPLAY ALL RESULTS");
        System.out.println("=============================================");

        System.out.println("\nArray:");
        array.display();

        System.out.println("\nStack:");
        stack.display();

        System.out.println("\nQueue:");
        queue.display();

        System.out.println("\nLinked List:");
        linkedList.display();

        System.out.println("\nGraph:");
        graph.displayGraph();

        System.out.println("=============================================");
    }
}