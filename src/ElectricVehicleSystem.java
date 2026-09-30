public class ElectricVehicleSystem {

    private final Battery battery;
    private final Motor motor;
    private final ChargingSystem chargingSystem;

    public ElectricVehicleSystem(EVComponentFactory factory) {
        this.battery = factory.createBattery();
        this.motor = factory.createMotor();
        this.chargingSystem = factory.createChargingSystem();
    }

    public void startVehicle() {
        System.out.println("\n--- Starting Vehicle ---");
        battery.supplyPower();
        motor.start();
        System.out.println("Vehicle is ready to drive.");
    }

    public void chargeVehicle() {
        System.out.println("\n--- Charging Vehicle ---");
        chargingSystem.charge();
        System.out.println(
                "Battery capacity: " + battery.getCapacity() + " kWh"
        );
    }

    public void showPerformance() {
        System.out.println("\n--- Vehicle Performance ---");
        System.out.println("Motor power: " + motor.getPower() + " kW");
        System.out.println(
                "Charging power: "
                        + chargingSystem.getChargingPower()
                        + " kW"
        );
    }

    public Battery getBattery() {
        return battery;
    }

    public Motor getMotor() {
        return motor;
    }

    public ChargingSystem getChargingSystem() {
        return chargingSystem;
    }
}