public class SportEVFactory implements EVComponentFactory {

    @Override
    public Battery createBattery() {
        return new SportBattery();
    }

    @Override
    public Motor createMotor() {
        return new SportMotor();
    }

    @Override
    public ChargingSystem createChargingSystem() {
        return new SportChargingSystem();
    }
}