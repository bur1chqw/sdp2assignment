public abstract class VehicleCreator {

    protected abstract ElectricVehicle createVehicle();

    public void startTrip() {

        ElectricVehicle vehicle = createVehicle();

        System.out.println("Starting trip...");
        vehicle.prepare();
        vehicle.drive();
        System.out.println("Trip successfully started.");
    }
}