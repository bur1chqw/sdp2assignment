import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose EV family (city, sport, luxury): ");
        String family = scanner.nextLine();

        Battery battery;
        Motor motor;
        ChargingSystem charger;

        if (family.equalsIgnoreCase("city")) {

            battery = new Battery("City", 50);
            motor = new Motor("City", 100);
            charger = new ChargingSystem("City", 50);

        } else if (family.equalsIgnoreCase("sport")) {

            battery = new Battery("Sport", 90);
            motor = new Motor("Sport", 400);
            charger = new ChargingSystem("Sport", 150);

        } else if (family.equalsIgnoreCase("luxury")) {

            battery = new Battery("Luxury", 110);
            motor = new Motor("Luxury", 300);
            charger = new ChargingSystem("Luxury", 200);

        } else {
            System.out.println("Unknown EV family.");
            return;
        }

        System.out.println("\nElectric vehicle created:");

        battery.supplyPower();
        motor.start();
        charger.charge();
    }
}