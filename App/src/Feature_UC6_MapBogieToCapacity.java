import java.util.HashMap;
import java.util.Map;

public class Feature_UC6_MapBogieToCapacity {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC6) ===");

        // Step 1: Create HashMap (Bogie → Capacity)
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Step 2: Insert values using put()
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 54);
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 100);

        // Step 3: Display all bogies with capacity
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        System.out.println("\nTotal Bogies: " + bogieCapacity.size());

        System.out.println("\nProgram completed.");
    }
}