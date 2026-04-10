import java.util.Arrays;
import java.util.Scanner;

public class Feature_UC20_ExceptionHandlingSearch {

    // Search method with fail-fast validation
    public static boolean searchBogie(String[] bogieIds, String key) {

        // Step 1: Fail-fast check
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train. Cannot perform search.");
        }

        // Step 2: Perform Linear Search (can also reuse binary if sorted)
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC20) ===");

        // 🔁 Change this to test different cases

        // Case 1: Empty array (will throw exception)
        // String[] bogieIds = {};

        // Case 2: Valid data
        String[] bogieIds = {"BG101", "BG205", "BG309"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        try {
            boolean found = searchBogie(bogieIds, searchKey);

            if (found) {
                System.out.println("Bogie ID " + searchKey + " found in the train consist.");
            } else {
                System.out.println("Bogie ID " + searchKey + " NOT found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("\nProgram completed.");
        scanner.close();
    }
}