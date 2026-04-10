public class Feature_UC15_SafeCargoAssignment {

    // Step 1: Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // Step 2: Goods Bogie Class
    static class GoodsBogie {
        String type;
        String cargo;

        public GoodsBogie(String type) {
            this.type = type;
        }

        // Step 3: Cargo Assignment Method
        public void assignCargo(String cargo) {
            try {
                // Rule: Rectangular bogie cannot carry Petroleum
                if (type.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException(
                            "Unsafe Assignment: Rectangular bogie cannot carry Petroleum"
                    );
                }

                // Safe assignment
                this.cargo = cargo;
                System.out.println(type + " Bogie assigned cargo: " + cargo);

            } catch (CargoSafetyException e) {
                // Step 4: Handle exception
                System.out.println("Error: " + e.getMessage());

            } finally {
                // Step 5: Always executes
                System.out.println("Assignment attempt completed for " + type + " bogie.\n");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC15) ===\n");

        // Step 6: Create bogies
        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");
        GoodsBogie rectangular = new GoodsBogie("Rectangular");

        // Step 7: Safe assignment
        cylindrical.assignCargo("Petroleum");

        // Step 8: Unsafe assignment (handled safely)
        rectangular.assignCargo("Petroleum");

        // Step 9: Continue program execution
        rectangular.assignCargo("Coal");

        System.out.println("Program completed safely.");
    }
}