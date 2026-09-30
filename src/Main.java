import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(
                "Choose EV family (city, sport, luxury): "
        );

        String family = scanner.nextLine();

        try {
            EVComponentFactory factory =
                    FactoryProvider.getFactory(family);

            ElectricVehicleSystem vehicle =
                    new ElectricVehicleSystem(factory);

            vehicle.startVehicle();
            vehicle.chargeVehicle();
            vehicle.showPerformance();

            System.out.println("\n--- Factory Method Demo ---");

            VehicleCreator creator;

            switch (family.toLowerCase()) {
                case "city" ->
                        creator = new CityVehicleCreator();

                case "sport" ->
                        creator = new SportVehicleCreator();

                case "luxury" ->
                        creator = new LuxuryVehicleCreator();

                default -> throw new IllegalArgumentException(
                        "Unknown EV family: " + family
                );
            }

            creator.startTrip();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}