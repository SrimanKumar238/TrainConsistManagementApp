import java.util.Scanner;

public class Feature_UC18_LinearSearchBogieID {

    // Linear Search Method
    public static boolean searchBogie(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {

            // Compare using equals()
            if (bogieIds[i].equals(key)) {
                return true; // Match found → stop early
            }
        }

        return false; // No match found
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC18) ===");

        // Step 1: Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Step 2: Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // Step 3: Perform Linear Search
        boolean found = searchBogie(bogieIds, searchKey);

        // Step 4: Display result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " found in the train consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT found.");
        }

        System.out.println("\nProgram completed.");
        scanner.close();
    }
}