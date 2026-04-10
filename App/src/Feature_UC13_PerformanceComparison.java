import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Feature_UC13_PerformanceComparison {

    // Bogie class
    static class Bogie {
        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC13) ===");

        // Step 1: Create large dataset
        List<Bogie> bogies = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Bogie-" + i, random.nextInt(100)));
        }

        // =========================
        // LOOP-BASED FILTERING
        // =========================
        long loopStart = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;

        // =========================
        // STREAM-BASED FILTERING
        // =========================
        long streamStart = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;

        // =========================
        // OUTPUT RESULTS
        // =========================
        System.out.println("\nResults Comparison:");

        System.out.println("Loop Filtered Bogies Count: " + loopResult.size());
        System.out.println("Stream Filtered Bogies Count: " + streamResult.size());

        System.out.println("\nExecution Time:");

        System.out.println("Loop Time (nanoseconds): " + loopTime);
        System.out.println("Stream Time (nanoseconds): " + streamTime);

        // Check consistency
        System.out.println("\nResult Match: " +
                (loopResult.size() == streamResult.size() ? "YES ✅" : "NO ❌"));

        System.out.println("\nProgram completed.");
    }
}