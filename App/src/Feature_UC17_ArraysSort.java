import java.util.Arrays;

public class Feature_UC17_ArraysSort {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC17) ===");

        // Step 1: Create array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Step 2: Display original array
        System.out.println("\nOriginal Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // Step 3: Sort using Arrays.sort()
        Arrays.sort(bogieNames);

        // Step 4: Display sorted array
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nProgram completed.");
    }
}