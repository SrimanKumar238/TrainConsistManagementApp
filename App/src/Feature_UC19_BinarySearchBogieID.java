import java.util.Arrays;
import java.util.Scanner;

public class Feature_UC19_BinarySearchBogieID {

    // Binary Search Method
    public static boolean binarySearch(String[] bogieIds, String key) {

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                return true; // Found
            } else if (comparison < 0) {
                high = mid - 1; // Search left
            } else {
                low = mid + 1; // Search right
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC19) ===");

        // Step 1: Create bogie ID array (unsorted example)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Step 2: Sort array (mandatory for Binary Search)
        Arrays.sort(bogieIds);

        System.out.println("\nSorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // Step 3: Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // Step 4: Perform Binary Search
        boolean found = binarySearch(bogieIds, searchKey);

        // Step 5: Display result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " found in the train consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT found.");
        }

        System.out.println("\nProgram completed.");
        scanner.close();
    }
}