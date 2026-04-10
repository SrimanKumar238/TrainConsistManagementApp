import java.util.*;

public class Feature_UC9_CountPassengerBogies {
    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("Cargo", 0));

        long count = bogies.stream()
                .filter(b -> b.capacity > 0)
                .count();

        System.out.println("Passenger Bogies Count: " + count);
    }
}