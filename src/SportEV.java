public class SportEV implements ElectricVehicle {

    @Override
    public void prepare() {
        System.out.println("Preparing Sport EV for high performance.");
    }

    @Override
    public void drive() {
        System.out.println("Sport EV is driving in performance mode.");
    }
}