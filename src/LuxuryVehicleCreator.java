public class LuxuryVehicleCreator extends VehicleCreator {

    @Override
    protected ElectricVehicle createVehicle() {
        return new LuxuryEV();
    }
}