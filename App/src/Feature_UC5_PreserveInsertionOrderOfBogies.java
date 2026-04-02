import java.util.LinkedHashSet;
import java.util.Set;

public class Feature_UC5_PreserveInsertionOrderOfBogies {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC5) ===");

        // Step 1: Create LinkedHashSet (maintains order + uniqueness)
        Set<String> trainFormation = new LinkedHashSet<>();

        // Step 2: Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 3: Add duplicate (will be ignored automatically)
        trainFormation.add("Sleeper");

        // Step 4: Display formation
        System.out.println("\nFinal Train Formation (in insertion order):");
        System.out.println(trainFormation);

        System.out.println("\nTotal bogies: " + trainFormation.size());

        System.out.println("\nProgram completed.");
    }
}