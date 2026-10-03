package analyzer;

public class Searching {

    // Linear Search
    public static int linearSearch(int[] array, int size, int target) {
        for (int i = 0; i < size; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }

    // Binary Search
    // Array must be sorted before using binary search
    public static int binarySearch(int[] array, int size, int target) {
        int low = 0;
        int high = size - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    // Display search result
    public static void displayResult(String searchType, int index) {
        if (index == -1) {
            System.out.println(searchType + ": Element not found.");
        } else {
            System.out.println(searchType + ": Element found at index " + index + ".");
        }
    }
}