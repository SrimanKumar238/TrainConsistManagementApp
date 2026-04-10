import java.util.Arrays;

public class Feature_UC16_BubbleSort {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC16) ===");

        // Step 1: Create array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("\nOriginal Capacities:");
        System.out.println(Arrays.toString(capacities));

        // Step 2: Bubble Sort Algorithm
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {

            // Optimization: Track if swap happens
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps → already sorted
            if (!swapped) {
                break;
            }
        }

        // Step 3: Display sorted result
        System.out.println("\nSorted Capacities (Ascending):");
        System.out.println(Arrays.toString(capacities));

        System.out.println("\nProgram completed.");
    }
}