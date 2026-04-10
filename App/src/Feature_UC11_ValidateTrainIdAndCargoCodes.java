import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Feature_UC11_ValidateTrainIdAndCargoCodes {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC11) ===");

        Scanner sc = new Scanner(System.in);

        // Step 1: Input from user
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // Step 2: Define Regex Patterns
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

        // Step 3: Compile Patterns
        Pattern trainPattern = Pattern.compile(trainRegex);
        Pattern cargoPattern = Pattern.compile(cargoRegex);

        // Step 4: Create Matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Step 5: Validate using matches()
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // Step 6: Display Results
        System.out.println("\nValidation Results:");

        if (isTrainValid) {
            System.out.println("Train ID is VALID ✅");
        } else {
            System.out.println("Train ID is INVALID ❌");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID ✅");
        } else {
            System.out.println("Cargo Code is INVALID ❌");
        }

        System.out.println("\nProgram completed.");
    }
}