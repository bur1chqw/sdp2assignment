public class LuxuryChargingSystem implements ChargingSystem {

    @Override
    public void charge() {
        System.out.println("Luxury intelligent charging system activated.");
    }

    @Override
    public int getChargingPower() {
        return 200;
    }
}