public class CityChargingSystem implements ChargingSystem {

    @Override
    public void charge() {
        System.out.println("City charging system starts charging.");
    }

    @Override
    public int getChargingPower() {
        return 50;
    }
}