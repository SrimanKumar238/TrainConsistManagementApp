import java.util.LinkedList;

public class Feature_UC4_MaintainOrderedBogieIDs {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC4) ===");

        // Step 1: Create LinkedList
        LinkedList<String> trainConsist = new LinkedList<>();

        // Step 2: Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // Step 3: Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry");

        System.out.println("\nAfter adding Pantry at position 2:");
        System.out.println(trainConsist);

        // Step 4: Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Step 5: Display final consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nProgram completed.");
    }
}