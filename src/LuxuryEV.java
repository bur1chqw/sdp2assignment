public class LuxuryEV implements ElectricVehicle {

    @Override
    public void prepare() {
        System.out.println("Preparing Luxury EV with comfort systems.");
    }

    @Override
    public void drive() {
        System.out.println("Luxury EV is driving in comfort mode.");
    }
}