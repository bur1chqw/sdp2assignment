public class CityVehicleCreator extends VehicleCreator {

    @Override
    protected ElectricVehicle createVehicle() {
        return new CityEV();
    }
}