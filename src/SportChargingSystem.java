public class SportChargingSystem implements ChargingSystem {

    @Override
    public void charge() {
        System.out.println("Sport fast-charging system activated.");
    }

    @Override
    public int getChargingPower() {
        return 150;
    }
}