import java.util.ArrayList;
import java.util.List;

public class Feature_UC2_AddPassengerBogies {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC2) ===");

        // Step 1: Create ArrayList
        List<String> passengerBogies = new ArrayList<>();

        // Step 2: Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 3: Display bogies
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Step 4: Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Step 5: Display after removal
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Step 6: Check existence
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("\nDoes Sleeper exist? " + exists);

        // Final state
        System.out.println("\nFinal Bogie List:");
        System.out.println(passengerBogies);

        System.out.println("\nProgram completed.");
    }
}