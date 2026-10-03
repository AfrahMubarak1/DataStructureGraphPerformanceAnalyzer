package analyzer;

import java.util.*;

public class Graph {

    private Map<Integer, List<Integer>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    // Add a vertex
    public void addVertex(int vertex) {
        if (!adjacencyList.containsKey(vertex)) {
            adjacencyList.put(vertex, new ArrayList<>());
            System.out.println("Vertex " + vertex + " added.");
        } else {
            System.out.println("Vertex already exists.");
        }
    }

    // Add an edge
    public void addEdge(int source, int destination) {
        if (!adjacencyList.containsKey(source)) {
            addVertex(source);
        }

        if (!adjacencyList.containsKey(destination)) {
            addVertex(destination);
        }

        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);

        System.out.println("Edge added between " + source + " and " + destination + ".");
    }

    // Display the graph
    public void displayGraph() {
        if (adjacencyList.isEmpty()) {
            System.out.println("Graph is empty.");
            return;
        }

        System.out.println("Graph:");

        for (int vertex : adjacencyList.keySet()) {
            System.out.print(vertex + " -> ");

            for (int neighbour : adjacencyList.get(vertex)) {
                System.out.print(neighbour + " ");
            }

            System.out.println();
        }
    }

    // BFS traversal
    public void bfs(int startVertex) {
        if (!adjacencyList.containsKey(startVertex)) {
            System.out.println("Vertex not found.");
            return;
        }

        Set<Integer> visited = new HashSet<>();
        java.util.Queue<Integer> queue = new java.util.LinkedList<>();

        visited.add(startVertex);
        queue.add(startVertex);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbour : adjacencyList.get(current)) {
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }

        System.out.println();
    }

    // DFS traversal
    public void dfs(int startVertex) {
        if (!adjacencyList.containsKey(startVertex)) {
            System.out.println("Vertex not found.");
            return;
        }

        Set<Integer> visited = new HashSet<>();

        System.out.print("DFS Traversal: ");
        dfsRecursive(startVertex, visited);
        System.out.println();
    }

    // Recursive DFS helper
    private void dfsRecursive(int vertex, Set<Integer> visited) {
        visited.add(vertex);
        System.out.print(vertex + " ");

        for (int neighbour : adjacencyList.get(vertex)) {
            if (!visited.contains(neighbour)) {
                dfsRecursive(neighbour, visited);
            }
        }
    }
}