import java.util.*;
import java.util.stream.Collectors;

// Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class Feature_UC9_GroupBogiesByType {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC9) ===");

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 72)); // duplicate type for grouping

        // Step 2: Group bogies using Stream
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Step 3: Display grouped result
        System.out.println("\nGrouped Bogies:");

        for (String key : groupedBogies.keySet()) {
            System.out.println("\n" + key + ":");

            for (Bogie b : groupedBogies.get(key)) {
                System.out.println("  Capacity → " + b.capacity);
            }
        }

        System.out.println("\nProgram completed.");
    }
}