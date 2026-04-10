import java.util.ArrayList;
import java.util.List;

// Goods Bogie class
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class Feature_UC12_SafetyComplianceCheck {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC12) ===");

        // Step 1: Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        // Try invalid case:
        // bogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // Step 2: Safety validation using Stream
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equalsIgnoreCase("Cylindrical")
                                || b.cargo.equalsIgnoreCase("Petroleum")
                );

        // Step 3: Display result
        System.out.println("\nSafety Compliance Check:");

        if (isSafe) {
            System.out.println("Train is SAFE ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }

        System.out.println("\nProgram completed.");
    }
}