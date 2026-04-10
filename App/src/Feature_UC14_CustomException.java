import java.util.ArrayList;
import java.util.List;

public class Feature_UC14_CustomException {

    // Step 1: Custom Exception Class
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // Step 2: Passenger Bogie Class
    static class PassengerBogie {
        String type;
        int capacity;

        public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

            // Step 3: Validation (Fail-Fast)
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }

            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return type + " Bogie with capacity " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC14) ===");

        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            // Valid bogies
            bogies.add(new PassengerBogie("Sleeper", 72));
            bogies.add(new PassengerBogie("AC Chair", 56));
            bogies.add(new PassengerBogie("First Class", 24));

            // Invalid bogie (Uncomment to test exception)
            // bogies.add(new PassengerBogie("Sleeper", -10));

        } catch (InvalidCapacityException e) {
            System.out.println("Exception Occurred: " + e.getMessage());
        }

        // Display valid bogies
        System.out.println("\nPassenger Bogies:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nProgram completed.");
    }
}