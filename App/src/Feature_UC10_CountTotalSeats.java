import java.util.ArrayList;
import java.util.List;

// Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class Feature_UC10_CountTotalSeats {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC10) ===");

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));

        // Step 2: Use Stream → map → reduce
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // Step 3: Display total
        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        System.out.println("\nProgram completed.");
    }
}