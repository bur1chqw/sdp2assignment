public class SportVehicleCreator extends VehicleCreator {

    @Override
    protected ElectricVehicle createVehicle() {
        return new SportEV();
    }
}