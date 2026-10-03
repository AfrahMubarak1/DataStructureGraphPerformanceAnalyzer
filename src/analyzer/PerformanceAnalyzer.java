package analyzer;

public class PerformanceAnalyzer {

    // Compare Linear Search and Binary Search
    public static void compareSearching(int[] array, int target) {

        System.out.println("\n=============================================");
        System.out.println("       SEARCH PERFORMANCE COMPARISON");
        System.out.println("=============================================");

        // Linear Search
        long startTime = System.nanoTime();

        int linearIndex = -1;
        int linearSteps = 0;

        for (int i = 0; i < array.length; i++) {
            linearSteps++;

            if (array[i] == target) {
                linearIndex = i;
                break;
            }
        }

        long linearTime = System.nanoTime() - startTime;

        // Binary Search
        startTime = System.nanoTime();

        int low = 0;
        int high = array.length - 1;
        int binaryIndex = -1;
        int binarySteps = 0;

        while (low <= high) {
            binarySteps++;

            int mid = (low + high) / 2;

            if (array[mid] == target) {
                binaryIndex = mid;
                break;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        long binaryTime = System.nanoTime() - startTime;

        System.out.println("Target: " + target);

        System.out.println("\nLinear Search:");
        System.out.println("Result: " +
                (linearIndex == -1 ? "Not Found" : "Found at index " + linearIndex));
        System.out.println("Steps: " + linearSteps);
        System.out.println("Execution Time: " + linearTime + " ns");

        System.out.println("\nBinary Search:");
        System.out.println("Result: " +
                (binaryIndex == -1 ? "Not Found" : "Found at index " + binaryIndex));
        System.out.println("Steps: " + binarySteps);
        System.out.println("Execution Time: " + binaryTime + " ns");

        System.out.println("\nComplexity:");
        System.out.println("Linear Search: O(n)");
        System.out.println("Binary Search: O(log n)");
        System.out.println("=============================================");
    }
}