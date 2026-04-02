import java.util.HashSet;
import java.util.Set;

public class Feature_UC3_TrackUniqueBogieIDs {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC3) ===");

        // Step 1: Create HashSet for Bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Step 2: Add Bogie IDs (including duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Step 3: Display unique bogie IDs
        System.out.println("\nBogie IDs after insertion (duplicates removed automatically):");
        System.out.println(bogieIDs);

        System.out.println("\nTotal unique bogies: " + bogieIDs.size());

        System.out.println("\nProgram completed.");
    }
}