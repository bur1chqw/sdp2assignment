import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(
                "Choose EV family (city, sport, luxury, offroad): "
        );

        String family = scanner.nextLine();

        try {
            // Abstract Factory
            EVComponentFactory factory =
                    FactoryProvider.getFactory(family);

            ElectricVehicleSystem vehicle =
                    new ElectricVehicleSystem(factory);

            vehicle.startVehicle();
            vehicle.chargeVehicle();
            vehicle.showPerformance();


            // Factory Method demo
            // OffRoad belongs to the newly added Abstract Factory family,
            // so Factory Method demo is used only for the original 3 types.
            if (!family.equalsIgnoreCase("offroad")) {

                System.out.println("\n--- Factory Method Demo ---");

                VehicleCreator creator = switch (family.toLowerCase()) {
                    case "city" -> new CityVehicleCreator();
                    case "sport" -> new SportVehicleCreator();
                    case "luxury" -> new LuxuryVehicleCreator();

                    default -> throw new IllegalArgumentException(
                            "Unknown EV family: " + family
                    );
                };

                creator.startTrip();
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}