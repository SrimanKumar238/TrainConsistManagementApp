import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class (custom object)
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class Feature_UC7_SortBogiesByCapacity {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC7) ===");

        // Step 1: Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        // Step 2: Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));

        // Step 3: Sort using Comparator (ascending capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 4: Display sorted bogies
        System.out.println("\nBogies sorted by capacity:");

        for (Bogie b : bogies) {
            System.out.println(b.name + " → " + b.capacity);
        }

        System.out.println("\nProgram completed.");
    }
}