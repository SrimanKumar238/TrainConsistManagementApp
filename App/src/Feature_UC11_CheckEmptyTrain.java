import java.util.*;

public class Feature_UC11_CheckEmptyTrain {
    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        if (bogies.isEmpty()) {
            System.out.println("Train is empty");
        } else {
            System.out.println("Train has bogies");
        }
    }
}