import java.util.ArrayList;
import java.util.List;

public class Feature_UC12_SafetyComplianceCheck {

    // GoodsBogie class (Custom Object)
    static class GoodsBogie {
        String type;
        String cargo;

        public GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " Bogie carrying " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC12) ===");

        // Step 1: Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Uncomment below line to test invalid case
        // bogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // Step 2: Display bogies
        System.out.println("\nGoods Bogies:");
        bogies.forEach(System.out::println);

        // Step 3: Apply safety validation using Stream
        boolean isSafe = bogies.stream().allMatch(bogie ->
                // Rule: Cylindrical bogie must carry Petroleum
                !bogie.type.equalsIgnoreCase("Cylindrical")
                        || bogie.cargo.equalsIgnoreCase("Petroleum")
        );

        // Step 4: Display result
        System.out.println("\nSafety Check Result:");

        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }

        System.out.println("\nProgram completed.");
    }
}