public class CityEV implements ElectricVehicle {

    @Override
    public void prepare() {
        System.out.println("Preparing City EV for daily driving.");
    }

    @Override
    public void drive() {
        System.out.println("City EV is driving in efficiency mode.");
    }
}