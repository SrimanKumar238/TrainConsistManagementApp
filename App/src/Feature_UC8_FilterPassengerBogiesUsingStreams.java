import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Feature_UC8_FilterPassengerBogiesUsingStreams {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC8) ===");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Cargo", 0));

        List<Bogie> passengerBogies = bogies.stream()
                .filter(b -> b.capacity > 0)
                .collect(Collectors.toList());

        System.out.println("\nPassenger Bogies:");
        passengerBogies.forEach(System.out::println);

        System.out.println("\nProgram completed.");
    }
}