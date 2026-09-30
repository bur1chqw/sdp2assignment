public class LuxuryEVFactory implements EVComponentFactory {

    @Override
    public Battery createBattery() {
        return new LuxuryBattery();
    }

    @Override
    public Motor createMotor() {
        return new LuxuryMotor();
    }

    @Override
    public ChargingSystem createChargingSystem() {
        return new LuxuryChargingSystem();
    }
}