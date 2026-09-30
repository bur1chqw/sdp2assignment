public class OffRoadChargingSystem implements ChargingSystem {

    @Override
    public void charge() {
        System.out.println("OffRoad charging system activated.");
    }

    @Override
    public int getChargingPower() {
        return 180;
    }
}